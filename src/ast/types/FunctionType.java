package ast.types;

import ast.ASTNode;
import ast.Expression;
import ast.Type;
import ast.definitions.VarDefinition;
import visitor.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public List<VarDefinition> getParameters() {
        return parameters;
    }

    public Type getReturnType() {
        return returnType;
    }

    @Override
    public Type parenthesis(List<Expression> params, ASTNode a){
        if (params.size() != parameters.size())
            return new ErrorType("la cantidad de parámetros no coinciden", a.getLine(),a.getColumn());

        for (int i = 0; i < params.size(); i++){
            if(!params.get(i).getType().equals(parameters.get(i).getType()))
                return new ErrorType("El tipo de los parámetros no coincide", a.getLine(),a.getColumn());
        }

        return returnType;
    }
}
