package SemanticAction;

import exe.Lex;
import exe.Token;

public class SemanticAction1 implements SemanticAction {

	@Override
	public void ejecutar(char caracter ) {
		Token token = new Token ();
		token.addChar(String.valueOf(caracter));
		Lex.setActualToken(token);
		Lex.incrementCursor();
	}

}
