package ast.statements;

import ast.Expression;
import visitor.Visitor;

public class Assignment extends AbstractStatement{
    private Expression left, right;

    public Assignment(Expression left, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
