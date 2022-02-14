package ast.expresssions;

import ast.Type;

public class IntLiteral extends AbstractExpression {
    private int value;

    public IntLiteral(int value, Type type, int line, int column) {
        super(type, line, column);
        this.value = value;
    }
}
