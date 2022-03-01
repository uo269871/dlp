package ast.expressions;

import ast.Expression;

public class Cast extends AbstractExpression {
    private Expression value;

    public Cast(Expression value, int line, int column) {
        super(line, column);
        this.value = value;
    }
}
