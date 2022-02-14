package ast;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractASTNode {

    private List<Definition> definitions;

    public Program(List<Definition> definitions,int line, int column){
        super(line,column);
        this.definitions = new ArrayList<>(definitions);
    }
}
