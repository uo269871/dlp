package ast.types;

import ast.AbstractASTNode;
import ast.Type;

public class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }
}
