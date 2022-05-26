package ast.statements;

import ast.Expression;
import visitor.Visitor;

public class Input extends AbstractStatement {
    private Expression input;

    public Input(Expression input, int line, int column) {
        super(line, column);
        this.input = input;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public Expression getInput() {
        return input;
    }
}
