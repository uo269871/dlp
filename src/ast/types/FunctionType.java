package ast.types;

import ast.Type;

public class FunctionType extends AbstractType {
    private Type returnType;
    // private List<VarDefinition> parameters;

    public FunctionType(Type returnType, int line, int column) {
        super(line, column);
        this.returnType = returnType;
    }

}
