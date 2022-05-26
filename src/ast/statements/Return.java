package ast.statements;

import ast.Expression;
import visitor.Visitor;

public class Return extends AbstractStatement {
    private Expression exp;

    public Return(Expression exp, int line, int column) {
        super(line, column);
        this.exp = exp;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public Expression getExp() {
        return exp;
    }
}
