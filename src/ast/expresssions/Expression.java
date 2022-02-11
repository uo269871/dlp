package ast.expresssions;

import ast.ASTNode;
import ast.types.Type;

public interface Expression extends ASTNode {
    public Type getType();
    public void setType(Type type);
}
