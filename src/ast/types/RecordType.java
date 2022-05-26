package ast.types;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class RecordType extends AbstractType {
    private List<RecordField> fields;

    public RecordType(List<RecordField> fields, int line, int column) {
        super(line, column);
        this.fields = new ArrayList<>(fields);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public List<RecordField> getFields() {
        return fields;
    }

    @Override
    public Type dot(String field, ASTNode a){
        for(RecordField f: fields){
            if(f.getName().equals(field))
                return f.getOf();
        }

        return new ErrorType("Campo no existente",a.getLine(),a.getColumn());
    }

    @Override
    public int numberOfBytes() {
        int n = 0;

        for(RecordField r: fields)
            n += r.getOf().numberOfBytes();

        return n;
    }

    public RecordField getRecordField(String name){
        for(RecordField f: fields){
            if(f.getName().equals(name))
                return f;
        }
        return null;
    }

    @Override
    public String toString() {
        return "RecordType[" +
                "fields:" + fields +
                ']';
    }
}
