package ast.types;

public class DefaultType implements  Type{
    private int column, line;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
