package codeGenerator;

import ast.Definition;
import ast.Program;
import ast.Statement;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.FunctionInvocation;
import ast.statements.*;
import ast.types.FunctionType;
import ast.types.VoidType;

public class ExecuteCGVisitor extends AbstractCGVisitor<FuncDefinition, Void> {

    private AddressCGVisitor addressCGVisitor;
    private ValueCGVisitor valueCGVisitor;

    public ExecuteCGVisitor(CodeGenerator cg) {
        super(cg);
        this.valueCGVisitor = new ValueCGVisitor(cg);
        this.addressCGVisitor = new AddressCGVisitor(cg, valueCGVisitor);
    }

    /*
        execute[[Program:program -> defs:definition*]]()=
            for(Definition d: defs)
                if (d is VarDefinition)
                    <>
            <call main:>
            <halt>
            for(Definition d:defs
                if (d is FuncDefinition)
                    execute[[d]]()
     */
    @Override
    public Void visit(Program p, FuncDefinition t) {
        for (Definition d : p.getDefinitions()) {
            if (d instanceof VarDefinition)
                d.accept(this, t);
        }
        cg.mainInvocation();
        for (Definition d : p.getDefinitions()) {
            if (d instanceof FuncDefinition)
                d.accept(this, t);
        }
        return null;
    }

    /*
        execute[[FuncDefinition:definition -> body:statement* type name:string]]()=
            {name}<:>
            < ' * Parameters>
            for (VarDefinition v: ((FunctionType) definition.type).definitions)
                execute[[v]]
            < ' * Local variables>
            for (Statement s: body)
                execute[[statement]]
            if((FunctionType)definition.type).type.equals(VoidType.getInstance))
                <ret 0,>
                    definition.localVariablesBytes <,>
                    definition.paramsBytes
     */
    @Override
    public Void visit(FuncDefinition f, FuncDefinition t) {
        cg.line(f.getLine());
        cg.writeLine();
        cg.id(f.getName());
        cg.comment("Parameters");
        for (VarDefinition v : ((FunctionType) f.getType()).getParameters())
            v.accept(this, t);

        cg.comment("Local variables");
        int i = 0;
        boolean hasParams= false;
        for (Statement s : f.getBody())
            if(s instanceof VarDefinition) {
                hasParams = true;
                i++;
                s.accept(this, t);
            }
            else{
                cg.enter(-f.getLocalVariablesBytes());
                break;
            }
        if(!hasParams)
            cg.enter(0);


        for(int j=i; j<f.getBody().size(); j++)
            f.getBody().get(j).accept(this,f);

        if (((FunctionType) f.getType()).getReturnType().equals(VoidType.getInstance())) {
            cg.ret(0, -f.getLocalVariablesBytes(), f.getParamsBytes());
        }
        return null;
    }

    /*
        execute[[VarDefinition: definition -> type name:string]]() =
            < ' * > type name <(offset > definition.offset <)>
     */
    @Override
    public Void visit(VarDefinition v, FuncDefinition param) {
        cg.comment(v.getType() + " " + v.getName()
                + " (offset " + v.getOffset() + ")");
        return null;
    }

    /*
        execute[[Assignment:statement -> expression1 expression2]]() =
            address[[expression1]]()
            value[[expression2]]()
            <store>expression1.type.suffix
     */
    public Void visit(Assignment a, FuncDefinition param) {
        cg.line(a.getLine());
        cg.comment("Assignment");
        a.getLeft().accept(this.addressCGVisitor, null);
        a.getRight().accept(this.valueCGVisitor, null);
        cg.store(a.getLeft().getType());
        return null;
    }

    /*
            execute[[FunctionInvocation:statement -> var:expression params:expression*]]()=
                value[[(Expression) FuncInvocation]]()
                if(FuncInvocation.type is not VoidType)
                    <pop> FuncInvocation.type.suffix
         */
    @Override
    public Void visit(FunctionInvocation f, FuncDefinition t) {
        cg.line(f.getLine());
        f.accept(valueCGVisitor, null);
        if (!f.getType().equals(VoidType.getInstance())) {
            cg.pop(f.getType());
        }
        return null;
    }

    /*
    execute[[if:statement -> condition:expression ifBody:statement* elseBoyd:statement*]]()=
	    int j = gc.getLabel();
	    int k = gc.getLabel();
	    value[[condition]]()
	    <jz label>j
	    for(statement st : ifBody)
	    	execute[[st]]()
	    <jmp label>k
	    <label>j<:>
	    for(statement st : elseBody)
	    	execute[[st]]()
	    <label>k<:>
     */
    @Override
    public Void visit(If_Else i, FuncDefinition t) {
        cg.line(i.getLine());
        cg.comment("If");
        cg.line(i.getLine());

        int j = cg.getLabel();
        int k = cg.getLabel();

        i.getCond().accept(valueCGVisitor, null);
        cg.jz("label" + j);

        cg.comment("if body");
        for (Statement st : i.getIfBody()) {
            st.accept(this, t);
        }
        cg.jmp("label" + k);
        cg.id("label" + j);

        cg.comment("else body");
        for (Statement st : i.getElseBody()) {
            st.accept(this, t);
        }
        cg.id("label" + k);
        return null;
    }

    /*
        execute[[Input:statement -> expression]]() =
            address[[expression]]()
            <in>expression.type.suffix
            <store>expression.type.suffix
     */
    @Override
    public Void visit(Input i, FuncDefinition param) {
        cg.line(i.getLine());
        cg.comment("Read");
        i.getInput().accept(this.addressCGVisitor, null);
        cg.in(i.getInput().getType());
        cg.store(i.getInput().getType());
        return null;
    }

    /*
        execute[[Print:statement -> expression]]() =
            value[[expression]]()
            <out>expression.type.suffix()
     */
    @Override
    public Void visit(Print p, FuncDefinition param) {
        cg.line(p.getLine());
        cg.comment("Write");
        p.getPrint().accept(this.valueCGVisitor, null);
        cg.out(p.getPrint().getType());
        return null;
    }

    /*
            execute[[return:statement -> exp:expression]](FuncDefinition f)=
            value[[expression]]()
            <ret > f.type.returnType.numberOfBytes
                <,> f.bytesLocalVariables
                <,> f.type.bytesParams
    */
    @Override
    public Void visit(Return r, FuncDefinition f) {
        cg.line(r.getLine());
        cg.comment("Return");
        r.getExp().accept(valueCGVisitor, null);
        cg.ret(((FunctionType) f.getType()).getReturnType().numberOfBytes(), -f.getLocalVariablesBytes(), f.getParamsBytes());
        return null;
    }

    /*
    execute[[while:statement -> condition:expression whileBody:statement*]]()=
	    int cond = gc.getLabel();
	    int end = gc.getLabel();
	    <label_>cond<:>
	    value[[condition]]()
	    <jz label_>end
	    for(statement st: whileBody)
	    	execute[[st]]()
	    <jmp label_>cond
	    <label_>end<:>
     */
    @Override
    public Void visit(WhileLoop w, FuncDefinition t) {
        cg.line(w.getLine());
        cg.comment("While");
        cg.line(w.getLine());
        int cond = cg.getLabel();
        int end = cg.getLabel();
        cg.id("label" + cond);
        w.getCond().accept(valueCGVisitor, null);
        cg.jz("label" + end);
        cg.comment("While body");
        for (Statement st : w.getWhileBody()) {
            st.accept(this, t);
        }
        cg.jmp("label" + cond);
        cg.id("label" + end);
        return null;
    }
}
