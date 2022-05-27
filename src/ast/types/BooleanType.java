package ast.types;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

public class BooleanType extends AbstractType {

    private static BooleanType booleanInstance;

    // Métodos de la clase BooleanType:
    private BooleanType(){
        super(0,0);
    }

    public static BooleanType getInstance(){
        if (booleanInstance == null)
            booleanInstance = new BooleanType();
        return booleanInstance;
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
    public Type logical(Type t, ASTNode a) {
        if(t.isLogical() || t instanceof ErrorType)
            return t;
        return super.logical(t, a);
    }

    @Override
    public Type logical(ASTNode a){
        return BooleanType.getInstance();
    }

    @Override
    public boolean isBuiltin() {
        return true;
    }

    @Override
    public Type canBeCast(Type t, ASTNode a){
        if(t instanceof ErrorType)
            return t;
        return new ErrorType("No se puede castear un tipo booleano", a.getLine(), a.getColumn());
    }

    @Override
    public Type promotesTo(Type t, ASTNode a){
        if(t instanceof ErrorType || t.equals(BooleanType.getInstance())) {
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
        return "BooleanType";
    }


}
