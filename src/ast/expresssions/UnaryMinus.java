package ast.expresssions;

import ast.Expression;
import ast.Type;

public class UnaryMinus extends AbstractExpression {
    private Expression value;

    public UnaryMinus(Expression value, Type type, int line, int column) {
        super(type, line, column);
        this.value = value;
    }
}
