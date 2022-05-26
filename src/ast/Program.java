package ast;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractASTNode {

    private List<Definition> definitions;

    public Program(List<Definition> definitions,int line, int column){
        super(line,column);
        this.definitions = new ArrayList<>(definitions);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP t) {
        return v.visit(this,t);
    }


    public List<Definition> getDefinitions() {
        return definitions;
    }
}
