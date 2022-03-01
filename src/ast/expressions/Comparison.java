package ast.expressions;

import ast.Expression;

public class Comparison extends AbstractExpression {
    private Expression left,right;
    private String operator;

    public Comparison(Expression left, Expression right, String operator, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }
}
