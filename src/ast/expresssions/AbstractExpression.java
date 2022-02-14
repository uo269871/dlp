package ast.expresssions;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Type;

public class AbstractExpression extends AbstractASTNode implements Expression {
    private Type type;

    public AbstractExpression(Type type, int line, int column) {
        super(line, column);
        setType(type);
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }
}
