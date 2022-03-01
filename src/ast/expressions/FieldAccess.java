package ast.expressions;

import ast.Expression;

public class FieldAccess extends AbstractExpression{
    private Expression left;
    private String field;

    public FieldAccess(Expression left, String field, int line, int column) {
        super(line, column);
        this.left = left;
        this.field = field;
    }
}
