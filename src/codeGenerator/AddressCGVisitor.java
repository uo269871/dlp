package codeGenerator;

import ast.definitions.VarDefinition;
import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.types.IntType;
import ast.types.RecordField;
import ast.types.RecordType;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {

    private ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator cg, ValueCGVisitor valueCGVisitor) {
        super(cg);
        this.valueCGVisitor = valueCGVisitor;
    }

    /*
        address[[ArrayAccess: expression -> exp1:expression exp2:expression]]()=
            address[[exp1]]
            value[[exp2]]
            <pushi>expression.type.numberOfBytes
            <muli>
            <addi>
     */
    @Override
    public Void visit(ArrayAccess arrayAccess, Void param) {
        arrayAccess.getLeft().accept(this, null);
        arrayAccess.getRight().accept(this.valueCGVisitor, null);
        cg.push(arrayAccess.getType().numberOfBytes());
        cg.mul(IntType.getInstance());
        cg.add(IntType.getInstance());
        return null;
    }

    /*
        address[[FieldAccess: expression -> name:expression field:string]]()=
            address[[name]]
            <pushi>expression.type.recordFieldByName(field).offset
            <add>expression.type.recordFieldByName(field).type.suffix
     */
    @Override
    public Void visit(FieldAccess fieldAccess, Void param) {
        fieldAccess.getLeft().accept(this, null);
        RecordField rf = ((RecordType)fieldAccess.getLeft().getType()).getRecordField(fieldAccess.getField());
        cg.push(rf.getOffset());
        cg.add(IntType.getInstance());
        return null;
    }

    /*
        address[[Variable: expression -> ID]]() =
            if (expression.definition.scope == 0)
                <pusha>expression.definition.offset
            else
                <pusha bp>
                <pushi>expression.definition.offset
                <addi>
     */
    @Override
    public Void visit(Variable variable, Void param){
        if (variable.getDef().getScope() == 0)
            cg.pushA(((VarDefinition)variable.getDef()).getOffset());
        else{
            cg.pushBP();
            cg.push(((VarDefinition)variable.getDef()).getOffset());
            cg.add(IntType.getInstance());
        } return null;
    }
}
