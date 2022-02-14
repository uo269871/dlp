package ast.types;

import ast.Type;
import ast.definitions.VarDefinition;

import java.util.List;

public class FunctionType extends AbstractType {
    private Type returnType;
    private List<VarDefinition> parameters;

    public FunctionType(Type returnType, int line, int column) {
        super(line, column);
        this.returnType = returnType;
    }

}
