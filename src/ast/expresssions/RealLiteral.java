package ast.expresssions;

import ast.Type;

public class RealLiteral extends AbstractExpression {
    private double value;

    public RealLiteral(double value, Type type, int line, int column) {
        super(type, line, column);
        this.value = value;
    }
}
