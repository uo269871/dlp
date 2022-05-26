package visitor;

import ast.*;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public interface Visitor<TP,TR> {
    public TR visit(Program p, TP t);

    public TR visit(FuncDefinition f, TP t);
    public TR visit(VarDefinition v, TP t);

    public TR visit(And_Or a, TP t);
    public TR visit(Arithmetic a, TP t);
    public TR visit(ArrayAccess a, TP t);
    public TR visit(Cast c, TP t);
    public TR visit(CharLiteral c, TP t);
    public TR visit(Comparison c, TP t);
    public TR visit(FieldAccess f, TP t);
    public TR visit(FunctionInvocation f, TP t);
    public TR visit(IntLiteral i, TP t);
    public TR visit(Not n, TP t);
    public TR visit(RealLiteral r, TP t);
    public TR visit(UnaryMinus u, TP t);
    public TR visit(Variable v, TP t);

    public TR visit(Assignment a, TP t);
    public TR visit(If_Else i, TP t);
    public TR visit(Input i, TP t);
    public TR visit(Print p, TP t);
    public TR visit(Return r, TP t);
    public TR visit(WhileLoop w, TP t);

    public TR visit(ArrayType a, TP t);
    public TR visit(CharType c, TP t);
    public TR visit(DoubleType d, TP t);
    public TR visit(ErrorType e, TP t);
    public TR visit(FunctionType f, TP t);
    public TR visit(IntType i, TP t);
    public TR visit(RecordField r, TP t);
    public TR visit(RecordType r, TP t);
    public TR visit(VoidType v, TP t);

}
