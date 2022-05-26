package codeGenerator;

import ast.Program;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import visitor.Visitor;

public abstract class AbstractCGVisitor<TP,TR> implements Visitor<TP,TR> {

    protected CodeGenerator cg;

    public AbstractCGVisitor(CodeGenerator cg){
        this.cg = cg;
    }

    @Override
    public TR visit(Program p, TP t) {
        throw new IllegalStateException("Code generation template \"Program\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(FuncDefinition f, TP t) {
        throw new IllegalStateException("Code generation template \"FuncDefinition\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(VarDefinition v, TP t) {
        throw new IllegalStateException("Code generation template \"VarDefinition\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(And_Or a, TP t) {
        throw new IllegalStateException("Code generation template \"And_Or\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(Arithmetic a, TP t) {
        throw new IllegalStateException("Code generation template \"Arithmetic\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(ArrayAccess a, TP t) {
        throw new IllegalStateException("Code generation template \"ArrayAccess\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(Cast c, TP t) {
        throw new IllegalStateException("Code generation template \"Cast\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(CharLiteral c, TP t) {
        throw new IllegalStateException("Code generation template \"CharLiteral\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(Comparison c, TP t) {
        throw new IllegalStateException("Code generation template \"Comparison\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(FieldAccess f, TP t) {
        throw new IllegalStateException("Code generation template \"FieldAccess\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(FunctionInvocation f, TP t) {
        throw new IllegalStateException("Code generation template \"FunctionInvocation\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(IntLiteral i, TP t) {
        throw new IllegalStateException("Code generation template \"IntLiteral\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(Not n, TP t) {
        throw new IllegalStateException("Code generation template \"Not\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(RealLiteral r, TP t) {
        throw new IllegalStateException("Code generation template \"RealLiteral\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(UnaryMinus u, TP t) {
        throw new IllegalStateException("Code generation template \"UnaryMinus\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(Variable v, TP t) {
        throw new IllegalStateException("Code generation template \"Variable\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(Assignment a, TP t) {
        throw new IllegalStateException("Code generation template \"Assignment\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(If_Else i, TP t) {
        throw new IllegalStateException("Code generation template \"If_Else\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(Input i, TP t) {
        throw new IllegalStateException("Code generation template \"Input\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(Print p, TP t) {
        throw new IllegalStateException("Code generation template \"Print\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(Return r, TP t) {
        throw new IllegalStateException("Code generation template \"Return\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(WhileLoop w, TP t) {
        throw new IllegalStateException("Code generation template \"WhileLoop\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(ArrayType a, TP t) {
        throw new IllegalStateException("Code generation template \"ArrayType\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(CharType c, TP t) {
        throw new IllegalStateException("Code generation template \"CharType\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(DoubleType d, TP t) {
        throw new IllegalStateException("Code generation template \"DoubleType\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(ErrorType e, TP t) {
        throw new IllegalStateException("Code generation template \"ErrorType\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(FunctionType f, TP t) {
        throw new IllegalStateException("Code generation template \"FunctionType\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(IntType i, TP t) {
        throw new IllegalStateException("Code generation template \"IntType\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(RecordField r, TP t) {
        throw new IllegalStateException("Code generation template \"RecordField\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(RecordType r, TP t) {
        throw new IllegalStateException("Code generation template \"RecordType\" not found in " + this.getClass().getName());
    }

    @Override
    public TR visit(VoidType v, TP t) {
        throw new IllegalStateException("Code generation template \"VoidType\" not found in " + this.getClass().getName());
    }
}
