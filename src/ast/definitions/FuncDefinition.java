package ast.definitions;

import ast.Statement;
import ast.Type;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends AbstractDefinition{

    private List<Statement> body;
    private int paramsBytes;
    private int localVariablesBytes;

    public FuncDefinition(List<Statement> body, String name, Type type, int line, int column) {
        super(name, type, line, column);
        this.body = new ArrayList<Statement>(body);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public List<Statement> getBody() {
        return body;
    }

    public int getParamsBytes() {
        return paramsBytes;
    }

    public void setParamsBytes(int paramsBytes) {
        this.paramsBytes = paramsBytes;
    }

    public int getLocalVariablesBytes() {
        return localVariablesBytes;
    }

    public void setLocalVariablesBytes(int localVariablesBytes) {
        this.localVariablesBytes = localVariablesBytes;
    }
}
