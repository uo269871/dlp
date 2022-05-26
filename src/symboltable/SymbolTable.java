package symboltable;

import java.util.*;

import ast.Definition;

public class SymbolTable {

    private int scope = 0;
    private List<Map<String, Definition>> table;

    public SymbolTable() {
        table = new ArrayList<>();
        table.add(new HashMap<>());
    }

    public void set() {
        table.add(new HashMap<>());
        scope++;
    }

    public void reset() {
        table.remove(scope--);
    }

    public boolean insert(Definition definition) {
        Definition aux = findInCurrentScope(definition.getName());
        if (aux == null) {
            definition.setScope(scope);
            table.get(scope).put(definition.getName(),definition);
            return true;
        }
        return false;
    }

    public Definition find(String id) {
        Definition d;

        for(int i = scope; i >= 0; i--){
            d = table.get(i).get(id);
            if(d != null) {
                return d;
            }
        }

        return null;
    }

    public Definition findInCurrentScope(String id) {
        return table.get(scope).get(id);
    }
}
