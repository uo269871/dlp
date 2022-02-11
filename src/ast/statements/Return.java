package ast.statements;

import ast.Expression;

public class Return extends AbstractStatement {
    private Expression exp;

    public Return(Expression exp, int line, int column) {
        super(line, column);
        this.exp = exp;
    }
}
