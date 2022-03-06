package ast.expressions;

import ast.Expression;
import ast.Type;

public class Cast extends AbstractExpression {
    private Expression value;
    private Type cast;

    public Cast(Expression value, Type cast, int line, int column) {
        super(line, column);
        this.value = value;
        this.cast = cast;
    }
}
