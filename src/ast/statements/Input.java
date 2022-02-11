package ast.statements;

import ast.Expression;

public class Input extends AbstractStatement {
    private Expression input;

    public Input(Expression input, int line, int column) {
        super(line, column);
        this.input = input;
    }
}
