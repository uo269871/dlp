package ast.definitions;

import ast.types.Type;

public interface Definition {
    public Type getType();
    public String getName();
}
