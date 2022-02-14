package ast.expresssions;

import ast.Expression;
import ast.Type;

public class Comparison extends AbstractExpression {
    private Expression value;

    public Comparison(Type type, int line, int column) {
        super(type, line, column);
    }
}
