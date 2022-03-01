package ast.expressions;

import ast.Type;

public class IntLiteral extends AbstractExpression {
    private int value;

    public IntLiteral(int value, int line, int column) {
        super(line, column);
        this.value = value;
    }
}
