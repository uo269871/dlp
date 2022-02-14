package ast.definitions;

import ast.Statement;
import ast.Type;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends AbstractDefinition{

    private List<Statement> body;

    public FuncDefinition(List<Statement> body, String name, Type type, int line, int column) {
        super(name, type, line, column);
        this.body = new ArrayList<Statement>(body);
    }
}
