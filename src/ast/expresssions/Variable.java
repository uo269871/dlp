package ast.expresssions;

import ast.Expression;
import ast.Type;

public class Variable extends AbstractExpression {
    private String name;

    public Variable(String name,Type type, int line, int column) {
        super(type, line, column);
        this.name = name;
    }
}
