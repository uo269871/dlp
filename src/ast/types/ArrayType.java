package ast.types;

import ast.Type;

public class ArrayType extends AbstractType {
    private int size;
    private Type of;

    public ArrayType(int size, Type of, int line, int column) {
        super(line, column);
        this.size = size;
        this.of = of;
    }
}
