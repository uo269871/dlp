package ast.expresssions;

import ast.Expression;
import ast.Type;

public class And_Or extends AbstractExpression {
    private Expression value;

    public And_Or(Type type, int line, int column) {
        super(type, line, column);
    }
}
