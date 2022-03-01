package ast.expressions;

import ast.Expression;

public class UnaryMinus extends AbstractExpression {
    private Expression value;

    public UnaryMinus(Expression value,int line, int column) {
        super(line, column);
        this.value = value;
    }
}
