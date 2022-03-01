package ast.expressions;

import ast.Expression;

public class ArrayAccess extends AbstractExpression{
    private Expression left,right;

    public ArrayAccess(Expression left, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
    }
}
