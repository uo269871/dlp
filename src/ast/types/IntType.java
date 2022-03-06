package ast.types;

public class IntType extends AbstractType {

    private static IntType intInstance;

    // Métodos de la clase IntType:
    private IntType(){
        super(0,0);
    }

    public static IntType getInstance(){
        if (intInstance == null)
            intInstance = new IntType();
        return intInstance;
    }
}
