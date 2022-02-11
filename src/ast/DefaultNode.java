package ast;

public class DefaultNode implements ASTNode{

    //IGUAL SE TIENE QUE BORRAR
    
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
