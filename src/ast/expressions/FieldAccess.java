package ast.expressions;

import ast.Expression;
import visitor.Visitor;

public class FieldAccess extends AbstractExpression{
    private Expression left;
    private String field;

    public FieldAccess(Expression left, String field, int line, int column) {
        super(line, column);
        this.left = left;
        this.field = field;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public Expression getLeft() {
        return left;
    }

    public String getField() {
        return field;
    }
}
