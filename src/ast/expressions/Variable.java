package ast.expressions;

import ast.Definition;
import visitor.Visitor;

public class Variable extends AbstractExpression {
    private String name;
    private Definition def;

    public Variable(String name,int line, int column) {
        super(line, column);
        this.name = name;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public String getName() {
        return name;
    }

    public Definition getDef() {
        return def;
    }

    public void setDef(Definition def) {
        this.def = def;
    }
}
