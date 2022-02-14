package ast.expresssions;

import ast.Expression;
import ast.Type;

public class Cast extends AbstractExpression {
    private Expression value;

    public Cast(Expression value,Type type, int line, int column) {
        super(type, line, column);
        this.value = value;
    }
}
