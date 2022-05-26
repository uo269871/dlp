package ast.expressions;

import ast.Expression;
import ast.Statement;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
    private Variable functionName;
    private List<Expression> functionParameters = new ArrayList<>();

    public FunctionInvocation(Variable functionName, List<Expression> functionParameters, int line, int column) {
        super(line, column);
        this.functionName = functionName;
        this.functionParameters.addAll(functionParameters);
    }

    public List<Expression> getFunctionParameters() {
        return functionParameters;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public Variable getVar(){
        return functionName;
    }
}
