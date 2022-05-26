package ast;

public interface Expression extends ASTNode {
    public Type getType();
    public void setType(Type type);
    public boolean getLValue();
    public void setLValue(boolean b);

}
