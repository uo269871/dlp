package ast.statements;

import ast.Expression;
import visitor.Visitor;

public class Print extends AbstractStatement {
    private Expression print;

    public Print(Expression print, int line, int column) {
        super(line, column);
        this.print = print;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public Expression getPrint() {
        return print;
    }
}
