package ast.expresssions;

import ast.Type;

public class CharLiteral extends AbstractExpression {
    private char value;

    public CharLiteral(char value, Type type, int line, int column) {
        super(type, line, column);
        this.value = value;
    }
}
