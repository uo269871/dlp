package ast.expressions;

import ast.Expression;
import visitor.Visitor;

public class Not extends AbstractExpression {
    private Expression value;

    public Not(Expression value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP,TR> v, TP t) {
        return  v.visit(this,t);
    }

    public Expression getValue() {
        return value;
    }
}
