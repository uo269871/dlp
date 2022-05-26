package ast.types;

import ast.ASTNode;
import ast.Expression;
import ast.Type;
import errorHandler.ErrorHandler;
import visitor.Visitor;

import java.util.List;

public class ErrorType extends AbstractType{
    private String message;

    public ErrorType(String message, int line, int column) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString() {
        return "ErrorType{" +
                "message='" + message + '\'' +
                " en linea " + getLine() +
                ", en columna " + getColumn() +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }


    @Override
    public Type arithmetic(Type t,ASTNode a) {
        return this;
    }

    @Override
    public Type arithmetic(ASTNode a) {
        return this;
    }

    @Override
    public Type logical(Type t,ASTNode a) {
        return this;
    }

    @Override
    public Type logical(ASTNode a) {
        return this;
    }

    @Override
    public Type promotesTo(Type t,ASTNode a) {
        return this;
    }

    @Override
    public Type canBeCast(Type t,ASTNode a) {
        return this;
    }

    @Override
    public Type comparison(Type t,ASTNode a) {
        return this;
    }

    @Override
    public Type squareBrackets(Type t, ASTNode a) {
        return this;
    }

    @Override
    public Type dot(String name,ASTNode a) {
        return this;
    }

    @Override
    public Type parenthesis(List<Expression> params,ASTNode a) {
        return this;
    }

    @Override
    public int numberOfBytes() {
        throw new IllegalStateException("No se debería de llegar aquí");
    }
}
