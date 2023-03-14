package ast;

import java.util.List;

public interface Type extends ASTNode {
    public boolean isLogical();

    public Type arithmetic(Type t, ASTNode a); // + - * /

    public Type arithmetic(ASTNode a); // Unario

    public Type comparison(Type t, ASTNode a);

    public Type logical(Type t, ASTNode a); // || &&

    public Type logical(ASTNode a); // !

    public Type dot(String field, ASTNode a);

    public Type squareBrackets(Type t, ASTNode a);

    public Type promotesTo(Type t, ASTNode a);

    public boolean isBuiltin();

    public Type canBeCast(Type t, ASTNode a);

    public Type parenthesis(List<Expression> params, ASTNode a);

    public int numberOfBytes();

    public char suffix(); // para otro tipos una illegalstateexception
}
