package ast.expressions;

import ast.Expression;
import ast.Type;

public class And_Or extends AbstractExpression {
    private Expression left,right;
    private String operator;

    public And_Or(Expression left, Expression right, String operator, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }
}
