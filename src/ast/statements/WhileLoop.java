package ast.statements;

import ast.Expression;
import ast.Statement;
import visitor.Visitor;

import java.util.List;

public class WhileLoop extends AbstractStatement{
    private List<Statement> whileBody;
    private Expression cond;

    public WhileLoop(List<Statement> whileBody, Expression cond, int line, int column) {
        super(line, column);
        this.whileBody = whileBody;
        this.cond = cond;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public List<Statement> getWhileBody() {
        return whileBody;
    }

    public Expression getCond() {
        return cond;
    }
}
