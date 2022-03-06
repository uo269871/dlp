package ast.types;

import ast.Type;
import ast.definitions.VarDefinition;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType {
    private Type returnType;
    private List<VarDefinition> parameters;

    public FunctionType(Type returnType, List<VarDefinition> parameters, int line, int column) {
        super(line, column);
        this.returnType = returnType;
        this.parameters = new ArrayList<VarDefinition>(parameters);
    }

}
