package visitor;

import ast.Definition;
import ast.Expression;
import ast.Program;
import ast.Statement;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {
    @Override
    public TR visit(Program p, TP t) {
        for (Definition d : p.getDefinitions())
            d.accept(this, t);
        return null;
    }

    @Override
    public TR visit(FuncDefinition f, TP t) {
        f.getType().accept(this, t);
        for (Statement s : f.getBody())
            s.accept(this, t);
        return null;
    }

    @Override
    public TR visit(VarDefinition v, TP t) {
        v.getType().accept(this, t);
        return null;
    }

    @Override
    public TR visit(And_Or a, TP t) {
        a.getLeft().accept(this, t);
        a.getRight().accept(this, t);
        return null;
    }

    @Override
    public TR visit(Arithmetic a, TP t) {
        a.getLeft().accept(this, t);
        a.getRight().accept(this, t);
        return null;
    }

    @Override
    public TR visit(ArrayAccess a, TP t) {
        a.getLeft().accept(this, t);
        a.getRight().accept(this, t);
        return null;
    }

    @Override
    public TR visit(Cast c, TP t) {
        c.getCast().accept(this, t);
        c.getValue().accept(this, t);
        return null;
    }

    @Override
    public TR visit(CharLiteral c, TP t) {
        return null;
    }

    @Override
    public TR visit(Comparison c, TP t) {
        c.getLeft().accept(this, t);
        c.getRight().accept(this, t);
        return null;
    }

    @Override
    public TR visit(FieldAccess f, TP t) {
        f.getLeft().accept(this, t);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation f, TP t) {
        f.getVar().accept(this, t);
        for (Expression e :
                f.getFunctionParameters()) {
            e.accept(this, t);
        }
        return null;
    }

    @Override
    public TR visit(IntLiteral i, TP t) {
        return null;
    }

    @Override
    public TR visit(Not n, TP t) {
        n.getValue().accept(this, t);
        return null;
    }

    @Override
    public TR visit(RealLiteral r, TP t) {
        return null;
    }

    @Override
    public TR visit(UnaryMinus u, TP t) {
        u.getValue().accept(this, t);
        return null;
    }

    @Override
    public TR visit(Variable v, TP t) {
        return null;
    }

    @Override
    public TR visit(Assignment a, TP t) {
        a.getLeft().accept(this, t);
        a.getRight().accept(this, t);
        return null;
    }

    @Override
    public TR visit(If_Else i, TP t) {
        i.getCond().accept(this, t);

        for (Statement s : i.getIfBody())
            s.accept(this, t);

        for (Statement s : i.getElseBody())
            s.accept(this, t);

        return null;
    }

    @Override
    public TR visit(Input i, TP t) {
        i.getInput().accept(this, t);
        return null;
    }

    @Override
    public TR visit(Print p, TP t) {
        p.getPrint().accept(this, t);
        return null;
    }

    @Override
    public TR visit(Return r, TP t) {
        r.getExp().accept(this, t);
        return null;
    }

    @Override
    public TR visit(WhileLoop w, TP t) {
        w.getCond().accept(this, t);
        for (Statement s : w.getWhileBody()) {
            s.accept(this, t);
        }
        return null;
    }

    @Override
    public TR visit(ArrayType a, TP t) {
        a.getOf().accept(this, t);
        return null;
    }

    @Override
    public TR visit(CharType c, TP t) {
        return null;
    }

    @Override
    public TR visit(DoubleType d, TP t) {
        return null;
    }

    @Override
    public TR visit(ErrorType e, TP t) {
        return null;
    }

    @Override
    public TR visit(FunctionType f, TP t) {
        f.getReturnType().accept(this, t);
        for (VarDefinition v : f.getParameters()) {
            v.accept(this, t);
        }
        return null;
    }

    @Override
    public TR visit(IntType i, TP t) {
        return null;
    }

    @Override
    public TR visit(RecordField r, TP t) {
        r.getOf().accept(this,t);
        return null;
    }

    @Override
    public TR visit(RecordType r, TP t) {
        for (RecordField f : r.getFields()) {
            f.accept(this, t);
        }
        return null;
    }

    @Override
    public TR visit(VoidType v, TP t) {
        return null;
    }
}
