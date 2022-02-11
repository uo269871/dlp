package ast;

import ast.definitions.Definition;

import java.util.List;

public class Program implements ASTNode {

    private List<Definition> definitions;

    public Program(int column, int line){

    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
