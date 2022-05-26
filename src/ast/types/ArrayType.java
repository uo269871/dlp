package ast.types;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

public class ArrayType extends AbstractType {
    private int size;
    private Type of;

    public ArrayType(int size, Type of, int line, int column) {
        super(line, column);
        this.size = size;
        this.of = of;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

    public Type getOf(){
        return of;
    }

    @Override
    public Type squareBrackets(Type t, ASTNode a){
        if(t.equals(IntType.getInstance()))
            return of;
        if(t instanceof ErrorType)
            return t;
        return new ErrorType("La posición tiene que ser un entero",a.getLine(),a.getColumn());
    }

    @Override
    public int numberOfBytes(){
        return of.numberOfBytes() * size;
    }

    @Override
    public String toString() {
        return "ArrayType[" +
                "of:" + of +
                ",size:" + size +
                ']';
    }
}
