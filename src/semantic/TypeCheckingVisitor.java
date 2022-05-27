package semantic;

import ast.*;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Void> {

    @Override
    public Void visit(FuncDefinition f, Type t){
        super.visit(f,((FunctionType)f.getType()).getReturnType());
        return null;
    }

    @Override
    public Void visit(And_Or a, Type t) {
        super.visit(a, t);
        a.setType(a.getLeft().getType().logical(a.getRight().getType(),a));
        a.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Arithmetic a, Type t) {
        super.visit(a, t);
        a.setType(a.getLeft().getType().arithmetic(a.getRight().getType(),a));
        a.setLValue(false);
        return null;
    }

    @Override
    public Void visit(ArrayAccess a, Type t) {
        super.visit(a, t);
        a.setType(a.getLeft().getType().squareBrackets(a.getRight().getType(),a));
        a.setLValue(true);
        return null;
    }

    @Override
    public Void visit(Cast c, Type t) {
        super.visit(c, t);

        c.setType(c.getValue().getType().canBeCast(c.getCast(),c));

        c.setLValue(false);

        return null;
    }

    @Override
    public Void visit(CharLiteral c, Type t) {
        super.visit(c, t);
        c.setLValue(false);
        c.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Void visit(Comparison c, Type t) {
        super.visit(c, t);
        c.setType(c.getLeft().getType().comparison(c.getRight().getType(),c));
        c.setLValue(false);
        return null;
    }

    @Override
    public Void visit(FieldAccess f, Type t) {
        super.visit(f, t);

        f.setType(f.getLeft().getType().dot(f.getField(),f));

        if (!f.getLeft().getLValue())
            new ErrorType("Se esperaba un lValue", 0, 0);

        f.setLValue(true);
        return null;
    }

    @Override
    public Void visit(FunctionInvocation f, Type t) {
        super.visit(f, t);
        f.setType(f.getVar().getType().parenthesis(f.getFunctionParameters(),f));
        f.setLValue(false);
        return null;
    }

    @Override
    public Void visit(IntLiteral i, Type t) {
        super.visit(i, t);
        i.setLValue(false);
        i.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(Not n, Type t) {
        super.visit(n, t);

        n.setType(n.getValue().getType().logical(n));

        n.setLValue(false);
        return null;
    }

    @Override
    public Void visit(RealLiteral r, Type t) {
        super.visit(r, t);
        r.setLValue(false);
        r.setType(DoubleType.getInstance());
        return null;
    }

    @Override
    public Void visit(UnaryMinus u, Type t) {
        super.visit(u, t);
        u.setType(u.getType().arithmetic(u));
        u.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Variable v, Type t) {
        super.visit(v, t);
        v.setType(v.getDef().getType());
        v.setLValue(true);
        return null;
    }

    @Override
    public Void visit(Assignment a, Type t) {
        super.visit(a, t);

        a.getLeft().setType(a.getLeft().getType().promotesTo(a.getRight().getType(),a));

        if (!a.getLeft().getLValue())
            new ErrorType("Se esperaba un lValue", a.getLine(), a.getColumn());
        return null;
    }

    @Override
    public Void visit(If_Else i, Type t) {
        super.visit(i, t);
        if(!i.getCond().getType().isLogical())
            new ErrorType("Se esperaba un tipo lógico", i.getCond().getLine(), i.getCond().getColumn());
        return null;
    }

    @Override
    public Void visit(Input i, Type t) {
        super.visit(i, t);
        if (!i.getInput().getLValue())
            new ErrorType("Se esperaba un lValue", i.getLine(), i.getColumn());
        else if(!i.getInput().getType().canBeInput())
            new ErrorType("No se puede leer por pantalla", i.getLine(), i.getColumn());
        return null;
    }

    @Override
    public Void visit(Return r, Type t){
        super.visit(r,t);
        if(!r.getExp().getType().equals(t)){
            new ErrorType("Tipo de retorno incorrecto", r.getLine(),r.getColumn());
        }
        return null;
    }

    @Override
    public Void visit(WhileLoop w, Type t){
        super.visit(w,t);

        if(!w.getCond().getType().isLogical())
            w.getCond().setType(new ErrorType("Se esperaba un tipo lógico", w.getLine(),w.getColumn()));
        return null;
    }

    @Override
    public Void visit(BooleanLiteral b, Type t) {
        super.visit(b, t);
        b.setLValue(false);
        b.setType(BooleanType.getInstance());
        return null;
    }

}
