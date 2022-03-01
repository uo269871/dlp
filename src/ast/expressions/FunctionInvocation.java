package ast.expressions;

import ast.Expression;
import ast.Statement;
import ast.definitions.AbstractDefinition;
import ast.statements.AbstractStatement;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
    private Expression left,right;
    private String functionName;
    private List<Expression> functionParameters = new ArrayList<>();

    public FunctionInvocation(String functionName, List<Expression> functionParameters, int line, int column) {
        super(line, column);
        this.functionName = functionName;
        this.functionParameters.addAll(functionParameters);
    }
}
