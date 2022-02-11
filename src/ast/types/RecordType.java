package ast.types;

import java.util.ArrayList;
import java.util.List;

public class RecordType extends AbstractType {
    private List<RecordField> fields;

    public RecordType(List<RecordField> fields, int line, int column) {
        super(line, column);
        this.fields = new ArrayList<>(fields);
    }

}
