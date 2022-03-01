package ast.expressions;

import ast.Expression;

public class Not extends AbstractExpression {
    private Expression value;

    public Not(Expression value, int line, int column) {
        super(line, column);
        this.value = value;
    }
}
