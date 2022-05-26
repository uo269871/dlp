package ast.expressions;

import visitor.Visitor;

public class CharLiteral extends AbstractExpression {
    private char value;

    public CharLiteral(char value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public char getValue() {
        return value;
    }
}
