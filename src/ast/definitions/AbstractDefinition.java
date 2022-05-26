package ast.definitions;

import ast.AbstractASTNode;
import ast.Definition;
import ast.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

    private Type type;
    private String name;
    private int scope;

    public AbstractDefinition(String name, Type type, int line, int column) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getScope(){
        return scope;
    }

    @Override
    public void setScope(int scope){
        this.scope = scope;
    }
}
