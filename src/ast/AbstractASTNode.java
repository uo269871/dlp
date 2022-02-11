package ast;

public class AbstractASTNode implements ASTNode{

    private int column, line;

    public  AbstractASTNode(int line, int column){
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
