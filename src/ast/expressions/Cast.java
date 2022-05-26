package ast.expressions;

import ast.Expression;
import ast.Type;
import visitor.Visitor;

public class Cast extends AbstractExpression {
    private Expression value;
    private Type cast;

    public Cast(Expression value, Type cast, int line, int column) {
        super(line, column);
        this.value = value;
        this.cast = cast;
    }

    public Expression getValue(){
        return value;
    }

    public Type getCast(){
        return cast;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }
}
