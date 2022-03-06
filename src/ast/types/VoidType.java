package ast.types;

import ast.types.AbstractType;

public class VoidType extends AbstractType {

    private static VoidType voidInstace;

    // Métodos de la clase RealType:
    private VoidType(){
        super(0,0);
    }

    public static VoidType getInstance(){
        if (voidInstace == null)
            voidInstace = new VoidType();
        return voidInstace;
    }
}
