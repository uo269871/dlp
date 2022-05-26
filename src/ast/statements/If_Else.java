package ast.statements;

import ast.Expression;
import ast.Statement;
import visitor.Visitor;

import java.util.List;

public class If_Else extends AbstractStatement{
    private List<Statement> ifBody,elseBody;
    private Expression cond;

    public If_Else(List<Statement> ifBody, List<Statement> elseBody, Expression cond, int line, int column) {
        super(line, column);
        this.ifBody = ifBody;
        this.elseBody = elseBody;
        this.cond = cond;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public Expression getCond() {
        return cond;
    }

    public List<Statement> getIfBody() {
        return ifBody;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }
}
