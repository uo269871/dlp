package errorHandler;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {
    private static ErrorHandler errorHandler;
    private List<ErrorType> errors;

    private ErrorHandler(){
        errors = new ArrayList<ErrorType>();
    }

    public static ErrorHandler getInstance(){
        if(errorHandler == null)
            errorHandler = new ErrorHandler();
        return  errorHandler;
    }

    public boolean hasErrors(){
        return !errors.isEmpty();
    }

    public void showErrors(PrintStream p){
        for(ErrorType e: errors){
            p.println(e.toString());
        }
    }

    public void addError(ErrorType e){
        errors.add(e);
    }
}
