package ast.types;

public class DoubleType extends AbstractType {

    private static DoubleType doubleInstace;

    // Métodos de la clase RealType:
    private DoubleType(){
        super(0,0);
    }

    public static DoubleType getInstance(){
        if (doubleInstace == null)
            doubleInstace = new DoubleType();
        return doubleInstace;
    }
}
