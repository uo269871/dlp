package ast.definitions;

import ast.AbstractASTNode;
import ast.Definition;
import ast.Type;

public class AbstractDefinition extends AbstractASTNode implements Definition {

    private Type type;
    private String name;

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
}
