package ast.definitions;

import ast.Statement;
import ast.Type;

import java.util.ArrayList;
import java.util.List;

public class VarDefinition extends AbstractDefinition{


    public VarDefinition(List<Statement> body, String name, Type type, int line, int column) {
        super(name, type, line, column);
    }
}
