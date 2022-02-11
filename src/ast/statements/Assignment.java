package ast.statements;

import ast.Expression;

public class Assignment extends AbstractStatement{
    private Expression left, right;

    public Assignment(Expression left, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
    }
}
