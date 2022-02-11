package ast.statements;

import ast.AbstractASTNode;
import ast.Statement;

public class AbstractStatement extends AbstractASTNode implements Statement {
    public AbstractStatement(int line, int column) {
        super(line, column);
    }
}
