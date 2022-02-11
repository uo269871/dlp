package ast.statements;

import ast.Expression;

public class Print extends AbstractStatement {
    private Expression print;

    public Print(Expression print, int line, int column) {
        super(line, column);
        this.print = print;
    }
}
