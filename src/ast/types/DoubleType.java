package ast.types;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

public class DoubleType extends AbstractType {

    private static DoubleType doubleInstance;

    // Métodos de la clase RealType:
    private DoubleType(){
        super(0,0);
    }

    public static DoubleType getInstance(){
        if (doubleInstance == null)
            doubleInstance = new DoubleType();
        return doubleInstance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    @Override
    public Type arithmetic(Type t, ASTNode a){
        if (t.equals(DoubleType.getInstance()) || t instanceof ErrorType)
            return t;
        return new ErrorType("Tipos incompatibles", a.getLine(),a.getColumn());
    }

    @Override
    public Type arithmetic(ASTNode a){
        return DoubleType.getInstance();
    }

    @Override
    public Type comparison(Type t, ASTNode a){
        if(t instanceof ErrorType)
            return t;
        if (t.equals(DoubleType.getInstance()))
            return BooleanType.getInstance();
        return new ErrorType("Tipos incompatibles", a.getLine(),a.getColumn());
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
        if(t instanceof ErrorType || t.equals(DoubleType.getInstance())) {
            return t;
        }

        return super.promotesTo(t,a);
    }

    @Override
    public int numberOfBytes() {
        return 4;
    }

    @Override
    public char suffix(){
        return 'f';
    }

    @Override
    public String toString() {
        return "DoubleType";
    }

    @Override
    public boolean canBeInput() {
        return true;
    }
}
