package semantic;

import ast.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.types.*;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

    private SymbolTable symbolTable = new SymbolTable();

    @Override
    public Void visit(FuncDefinition f, Void t) {
        boolean b = symbolTable.insert(f);
        if (!b)
            new ErrorType("Función " + f.getName() + " ya definida", f.getLine(), f.getColumn());

        symbolTable.set();
        super.visit(f, t);
        symbolTable.reset();

        return null;
    }

    @Override
    public Void visit(VarDefinition v, Void t) {
        super.visit(v, t);
        boolean b = symbolTable.insert(v);
        if (!b)
            new ErrorType("Variable " + v.getName() + " ya definida", v.getLine(), v.getColumn());
        return null;
    }

    @Override
    public Void visit(Variable v, Void t) {
        super.visit(v, t);
        Definition aux = symbolTable.find(v.getName());
        if (aux == null) {
            aux = new VarDefinition(v.getName(),
                    new ErrorType("Variable " + v.getName() + " no definida", v.getLine(), v.getColumn()),
                    v.getLine(), v.getColumn());
        }
        v.setDef(aux);

        return null;
    }
}
