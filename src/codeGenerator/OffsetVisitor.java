package codeGenerator;

import ast.Statement;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.types.FunctionType;
import ast.types.RecordField;
import ast.types.RecordType;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Integer, Integer> {

    private int globalOffset = 0;

    @Override
    public Integer visit(FuncDefinition f, Integer t) {
        int sumBytesScope = 4;
        f.setParamsBytes(f.getType().accept(this, sumBytesScope));
        sumBytesScope = 0;
        Integer bytes = null;
        for (Statement s :f.getBody()) { // VARIABLES LOCALES: BP - sumatorio variables anteriores (y ella misma)
            bytes = s.accept(this, sumBytesScope);
            if (bytes != null) // puede ser otra parte del cuerpo de la función
                sumBytesScope = bytes;
        }


        f.setLocalVariablesBytes(sumBytesScope);

        return null;
    }

    @Override
    public Integer visit(VarDefinition v, Integer t) {
        super.visit(v, t);
        // Global scope es 0
        if (v.getScope() == 0) {
            v.setOffset(globalOffset);
            globalOffset += v.getType().numberOfBytes();
            return null;
        } else {
            if (v.getScope() == 1) {
                Integer i = null;
                if (t > 0) {
                    // Es paramentro
                    v.setOffset(t);
                    i = t + v.getType().numberOfBytes();
                } else {
                    // Es local
                    i = t - v.getType().numberOfBytes();
                    v.setOffset(i);
                }
                return i;
            }
        }

        return null;
    }

    @Override
    public Integer visit(FunctionType f, Integer t) {
        f.getReturnType().accept(this, t);
        for (int i = f.getParameters().size() - 1; i >= 0; i--) {
            // BP + 4 + Sum tamaño argumentos derecha
            t = f.getParameters().get(i).accept(this, t);
        }

        return t-4;
    }

    @Override
    public Integer visit(RecordField r, Integer t) {
        r.getOf().accept(this, t);
        r.setOffset(t);
        return r.getOffset() + r.getOf().numberOfBytes();
    }

    @Override
    public Integer visit(RecordType r, Integer t) {
        int offset = 0;

        for (RecordField f : r.getFields()) {
            offset = f.accept(this, offset);
        }

        return null;
    }
}
