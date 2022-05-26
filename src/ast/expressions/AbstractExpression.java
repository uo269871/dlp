package ast.expressions;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
    private Type type;
    private boolean lValue;

    public AbstractExpression(int line, int column) {
        super(line, column);
//        setType(type);
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setLValue(boolean b){
        this.lValue = b;
    }

    @Override
    public boolean getLValue(){
        return lValue;
    }
}
