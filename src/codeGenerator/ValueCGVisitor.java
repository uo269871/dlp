package codeGenerator;

import ast.Expression;
import ast.Type;
import ast.expressions.*;
import ast.types.CharType;
import ast.types.DoubleType;
import ast.types.IntType;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator cg) {
        super(cg);
        this.addressCGVisitor = new AddressCGVisitor(cg, this);
    }

    /*
        value[[And_Or: expression -> exp1:expression operator:string exp2:expression]]()=
            value[[exp1]]
            value[[exp2]]
            <operator>
     */
    @Override
    public Void visit(And_Or a, Void param){
        a.getLeft().accept(this,null);
        a.getRight().accept(this, null);
        switch (a.getOperator()){
            case "||":
                cg.or();
                break;
            case "&&":
                cg.and();
                break;
        }
        return null;
    }

    /*
        value[[Arithmetic: expression -> exp1:expression operator:string exp2:expression]]()=
            value[[exp1]]
            value[[exp2]]
            switch (operator)
                case "*":
                    <mul>expression.type.suffix
                    break;
                case "/":
                    <div>expression.type.suffix
                    break;
                case "+":
                    <add>expression.type.suffix
                    break;
                case "-":
                    <sub>expression.type.suffix
                    break;
                case "%":
                    <mod>expression.type.suffix
                    break;
     */
    public Void visit(Arithmetic a, Void param){
        a.getLeft().accept(this, null);
        a.getRight().accept(this,null);
        Type t =  a.getLeft().getType();
        switch (a.getOperator()){
            case "*":
                cg.mul(t);
                break;
            case "/":
                cg.div(t);
                break;
            case "+":
                cg.add(t);
                break;
            case "-":
                cg.sub(t);
                break;
            case "%":
                cg.mod(t);
                break;
        }
        return null;
    }

    /*
    value[[ArrayAccess: expression -> exp1:expression exp2:expression]]()=
    address[[expression]]
            <load>expression.type.suffix
     */
    public Void visit(ArrayAccess arrayAccess, Void param){
        arrayAccess.accept(this.addressCGVisitor, null);
        cg.load(arrayAccess.getType());
        return null;
    }

    /*
        value[[Cast: expression -> type exp:expression]]()=
            value[[exp]]
            exp.type.canBeCast(type)
     */
    public Void visit(Cast c, Void param){
        c.getValue().accept(this, param);

        if(c.getValue().getType().equals(CharType.getInstance())){
            cg.b2i();
            if(c.getCast().equals(DoubleType.getInstance())){
                cg.i2f();
            }
        } else if(c.getValue().getType().equals(IntType.getInstance())){
            if(c.getCast().equals(DoubleType.getInstance())){
                cg.i2f();
            } else{
                cg.i2b();
            }
        } else{
            cg.f2i();
            if(c.getCast().equals(CharType.getInstance())){
                cg.i2b();
            }
        }
        return null;
    }

    /*
        value[[CharLiteral: expression -> value:char]]()=
            <pushb>value
     */
    @Override
    public Void visit(CharLiteral charLiteral, Void param){
        cg.push(charLiteral.getValue());
        return null;
    }

    /*
        value[[Comparison: expression -> exp1:expression comparator:string exp2:expression]]()=
            value[[exp1]]
            value[[exp2]]
            <comparator>exp1.type.suffix
     */
    @Override
    public Void visit(Comparison comparison, Void param){
        comparison.getLeft().accept(this, null);
        comparison.getRight().accept(this, null);
        Type suffix = comparison.getLeft().getType();
        switch (comparison.getOperator()){
            case ">":
                cg.gt(suffix);
                break;
            case ">=":
                cg.ge(suffix);
                break;
            case "==":
                cg.eq(suffix);
                break;
            case "!=":
                cg.ne(suffix);
                break;
            case "<=":
                cg.le(suffix);
                break;
            case "<":
                cg.lt(suffix);
                break;
        }
        return null;
    }

    /*
        value[[FieldAccess: expression -> name:expression field:string]]()=
            address[[expression]]
            <load>expression.type.recordFieldByName(field).type.suffix
     */
    public Void visit (FieldAccess fieldAccess, Void param){
        fieldAccess.accept(this.addressCGVisitor, null);
        cg.load(fieldAccess.getType());
        return null;
    }

    /*
        value[[FuncInvocation:expression -> var:expression params:expression*]]()=
	        for(Expression e:params)
	        	value[[e]]()
	        <call > var.name
     */

    @Override
    public Void visit(FunctionInvocation f, Void t) {
        for(Expression e: f.getFunctionParameters()){
            e.accept(this,t);
        }
        cg.call(f.getVar().getName());
        return null;
    }

    /*
           value[[IntLiteral: expression -> value:int]]()=
               <pushi>value
        */
    @Override
    public Void visit(IntLiteral intLiteral, Void param){
        cg.push(intLiteral.getValue());
        return null;
    }

    /*
        value[[NOT: expression -> value:expression]]()=
            value[[expression]]
            <not>
     */
    @Override
    public Void visit(Not not, Void param){
        not.getValue().accept(this, null);
        cg.not();
        return null;
    }

    /*
        value[[RealLiteral: expression -> value:double]]()=
            <pushf>value
     */
    @Override
    public Void visit(RealLiteral realLiteral, Void param){
        cg.push(realLiteral.getValue());
        return null;
    }

    /*
        value[[UnaryMinus: expression -> value:expression]]()=
            value[[value]]
            <pushi> -1
            <mul>value.tipo.suffix
     */
    @Override
    public Void visit(UnaryMinus unaryMinus, Void param){
        unaryMinus.getValue().accept(this, null);
        cg.push(-1);
        cg.mul(unaryMinus.getValue().getType());
        return null;
    }

    /*
        value[[Variable: expression -> ID]]() =
            address[[expression]]()
            <load>expression.type.suffix()
     */
    @Override
    public Void visit(Variable variable, Void param){
        variable.accept(this.addressCGVisitor, null);
        cg.load(variable.getType());
        return null;
    }
}
