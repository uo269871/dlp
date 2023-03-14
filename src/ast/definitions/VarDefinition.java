package ast.definitions;

import ast.Statement;
import ast.Type;
import visitor.Visitor;


public class VarDefinition extends AbstractDefinition implements Statement{

    private int offset;

    public VarDefinition(String name, Type type, int line, int column) {
        super(name, type, line, column);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset){
        this.offset = offset;
    }
}
