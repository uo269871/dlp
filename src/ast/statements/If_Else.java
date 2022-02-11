package ast.statements;

import ast.Expression;
import ast.Statement;

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
}
