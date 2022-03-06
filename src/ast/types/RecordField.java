package ast.types;

import ast.AbstractASTNode;
import ast.Type;

public class RecordField extends AbstractASTNode {

    private Type of;
    private String name;

    public RecordField(String name, Type of, int line, int column) {
        super(line, column);
        this.name = name;
        this.of = of;
    }
}
