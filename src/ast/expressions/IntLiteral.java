package ast.expressions;

import ast.Type;
import visitor.Visitor;

public class IntLiteral extends AbstractExpression {
    private int value;

    public IntLiteral(int value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public int getValue() {
        return value;
    }
}
