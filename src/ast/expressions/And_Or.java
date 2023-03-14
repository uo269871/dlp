package ast.expressions;

import ast.Expression;
import visitor.Visitor;

public class And_Or extends AbstractExpression {
    private Expression left,right;
    private String operator;

    public And_Or(Expression left, Expression right, String operator, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.operator = operator;
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

    public String getOperator() {
        return operator;
    }
}
