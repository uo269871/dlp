package ast.types;

import ast.AbstractASTNode;
import ast.Type;
import visitor.Visitor;

import java.util.Objects;

public class RecordField extends AbstractASTNode {

    private Type of;
    private String name;
    private int offset;

    public RecordField(String name, Type of, int line, int column) {
        super(line, column);
        this.name = name;
        this.of = of;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordField that = (RecordField) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public Type getOf() {
        return of;
    }

    public String getName() {
        return name;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "Field[" +
                "name:" + name +
                ",type:" + of +
                ",offset:" + offset +
                ']';
    }
}
