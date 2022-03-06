package ast.types;

public class CharType extends AbstractType {

    private static CharType charInstance;

    // Métodos de la clase CharType:
    private CharType(){
        super(0,0);
    }

    public static CharType getInstance(){
        if (charInstance == null)
            charInstance = new CharType();
        return charInstance;
    }
}
