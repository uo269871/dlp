package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static double lexemeToReal(String str) {
		try {
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static int lexemeToBoolean(String str) {
		if(str.equals("true"))
			return 1;
		return 0;
	}

	public static char lexemeToChar(String text) {
		if (text.charAt(0) == '\'' && text.charAt(text.length()-1) == '\'') {
			String aux = text.substring(1, text.length() - 1);
			if (aux.charAt(0) == '\\') {
				if (aux.length()==2) {
					// Es caracter especial
					switch (aux.charAt(1)) {
						case 't':
							return '\t';
						case 'r':
							return '\r';
						case 'n':
							return '\n';
					}
				}
				try {
					// Es \ seguido de un numero
					return (char) Integer.parseInt(aux.substring(1));
				}
				catch (NumberFormatException e){
					System.out.println(e);
				}
			}
			else
				// Es texto plano
				return aux.charAt(0);
		}
		return '\0';
	}
}
