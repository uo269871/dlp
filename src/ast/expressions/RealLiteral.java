package ast.expressions;

import visitor.Visitor;

public class RealLiteral extends AbstractExpression {
    private double value;

    public RealLiteral(double value,  int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public double getValue() {
        return value;
    }
}
