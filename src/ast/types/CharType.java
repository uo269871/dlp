package ast.types;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

public class CharType extends AbstractType {

    private static CharType charInstance;

    // Métodos de la clase CharType:
    private CharType(){
        super(0,0);
    }

    public static CharType getInstance(){
        if (charInstance == null)
            charInstance = new CharType();
        return charInstance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    @Override
    public Type arithmetic(Type t, ASTNode a){
        if (t.equals(CharType.getInstance()) || t instanceof ErrorType)
            return t;
        return new ErrorType("Tipos incompatibles", a.getLine(),a.getColumn());
    }

    @Override
    public Type arithmetic(ASTNode a){
        return CharType.getInstance();
    }

    @Override
    public Type comparison(Type t, ASTNode a){
        if (t.equals(CharType.getInstance()))
            return BooleanType.getInstance();
        if (t instanceof ErrorType)
            return t;
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
        if(t instanceof ErrorType || t.equals(CharType.getInstance())) {
            return t;
        }

        return super.promotesTo(t,a);
    }

    @Override
    public int numberOfBytes(){
        return 1;
    }

    @Override
    public char suffix(){
        return 'b';
    }

    @Override
    public String toString() {
        return "CharType";
    }

    @Override
    public boolean canBeInput() {
        return true;
    }
}
