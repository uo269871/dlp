package ast.types;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

public class IntType extends AbstractType {

    private static IntType intInstance;

    // Métodos de la clase IntType:
    private IntType(){
        super(0,0);
    }

    public static IntType getInstance(){
        if (intInstance == null)
            intInstance = new IntType();
        return intInstance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public Type arithmetic(Type t, ASTNode a){
        if (t.equals(IntType.getInstance()) || t instanceof ErrorType)
            return t;
        return new ErrorType("Tipos incompatibles", a.getLine(),a.getColumn());
    }

    @Override
    public Type arithmetic(ASTNode a){
       return IntType.getInstance();
    }

    @Override
    public Type comparison(Type t, ASTNode a){
        if (t.equals(IntType.getInstance()) || t instanceof ErrorType)
            return t;
        return new ErrorType("Tipos incompatibles", a.getLine(),a.getColumn());
    }

    @Override
    public Type logical(Type t, ASTNode a) {
        if(t.isLogical() || t instanceof ErrorType)
            return t;
        return super.logical(t, a);
    }

    @Override
    public Type logical(ASTNode a){
        return IntType.getInstance();
    }

    @Override
    public boolean isBuiltin() {
        return true;
    }

    @Override
    public Type canBeCast(Type t, ASTNode a){
        if(t.isBuiltin() || t instanceof ErrorType)
            return t;
        return super.canBeCast(t,a);
    }

    @Override
    public Type promotesTo(Type t, ASTNode a){
        if(t instanceof ErrorType || t.equals(IntType.getInstance())) {
            return t;
        }

        return super.promotesTo(t,a);
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public char suffix(){
        return 'i';
    }

    @Override
    public String toString() {
        return "IntType";
    }
}
