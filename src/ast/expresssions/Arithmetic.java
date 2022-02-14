package ast.expresssions;

import ast.Expression;
import ast.Type;

public class Arithmetic extends AbstractExpression {
    private Expression left,right;
    private String operator;

    public Arithmetic(Expression left, Expression right, String operator, Type type, int line, int column) {
        super(type, line, column);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }
}
