package ast.types;

import visitor.Visitor;

public class VoidType extends AbstractType {

    private static VoidType voidInstance;

    private VoidType(){
        super(0,0);
    }

    public static VoidType getInstance(){
        if (voidInstance == null)
            voidInstance = new VoidType();
        return voidInstance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }

}
