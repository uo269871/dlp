package ast.expresssions;

import ast.Expression;
import ast.Type;

public class Not extends AbstractExpression {
    private Expression value;

    public Not(Type type, int line, int column) {
        super(type, line, column);
    }
}
