import codeGenerator.*;
import errorHandler.ErrorHandler;
import parser.*;

import org.antlr.v4.runtime.*;

import ast.Program;
import semantic.*;

public class Main {

//	public static void main(String... args) throws Exception {
//		if (args.length<1) {
//			System.err.println("Please, pass me the input file.");
//			return;
//		}
//
//		// create a lexer that feeds off of input CharStream
//		CharStream input = CharStreams.fromFileName(args[0]);
//		PmmLexer lexer = new PmmLexer(input);
//
//		// create a parser that feeds off the tokens buffer
//		CommonTokenStream tokens = new CommonTokenStream(lexer);
//		PmmParser parser = new PmmParser(tokens);
//		Program ast = parser.program().ast;
//
//		// * The AST is shown
//		IntrospectorModel model=new IntrospectorModel("Program", ast);
//		new IntrospectorTree("Introspector", model);
//	}


	public static void main(String... args) throws Exception {
		if (args.length<2) {
			System.err.println("Please, pass me the input and the output files.");
			return;
		}

		// create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		PmmLexer lexer = new PmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PmmParser parser = new PmmParser(tokens);
		Program ast = parser.program().ast;

		ast.accept(new IdentificationVisitor(),null);
		ast.accept(new TypeCheckingVisitor(),null);


		// * Check errors
		if(ErrorHandler.getInstance().hasErrors()){
			// * Show errors
			ErrorHandler.getInstance().showErrors(System.err);
		}
		else{
			// * The AST is shown
			ast.accept(new OffsetVisitor(),0);
			ast.accept(new ExecuteCGVisitor(new CodeGenerator(args[1], args[0])),null);
//			IntrospectorModel model=new IntrospectorModel("Program", ast);
//			new IntrospectorTree("Introspector", model);
		}
	}
}
