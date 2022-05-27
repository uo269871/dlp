package ast.types;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.Expression;
import ast.Type;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public Type arithmetic(Type t, ASTNode a) {
        return null;
    }

    @Override
    public Type arithmetic(ASTNode a) {
        return new ErrorType("Solo puede aplicarse en tipos primitivos",a.getLine(),a.getColumn());
    }

    @Override
    public Type comparison(Type t, ASTNode a) {
        return new ErrorType("Los tipos de los operandos no son correctos", a.getLine(),a.getColumn());
    }

    @Override
    public Type logical(Type t, ASTNode a) {
        return new ErrorType("Se esperaba un tipo lógico",a.getLine(),a.getColumn());
    }

    @Override
    public Type logical(ASTNode a) {
        return new ErrorType("Se esperaba un tipo lógico",a.getLine(),a.getColumn());
    }

    @Override
    public Type dot(String field, ASTNode a) {
        return null;
    }

    @Override
    public Type squareBrackets(Type t, ASTNode a) {
        return new ErrorType("[] solo se puede aplicar a arrays",a.getLine(),a.getColumn());
    }

    @Override
    public Type promotesTo(Type t, ASTNode a) {
        return new ErrorType("Tipos incompatibles",a.getLine(),a.getColumn());
    }

    @Override
    public boolean isBuiltin() {
        return false;
    }

    @Override
    public Type canBeCast(Type t, ASTNode a) {
        return new ErrorType("No se puede castear tipos no primitivos",a.getLine(),a.getColumn());
    }

    @Override
    public Type parenthesis(List<Expression> params, ASTNode a) {
        return null;
    }

    @Override
    public int numberOfBytes(){
        return 0;
    }

    @Override
    public char suffix(){
        throw new IllegalStateException("Tipo no tiene sufijo");
    }

    @Override
    public boolean canBeInput() {
        return false;
    }
}
