package SemanticAction;

import exe.Lex;
import exe.Token;

public class SemanticAction6 extends SemanticAction {
	
	@Override
	public void ejecutar(char caracter) {
		Token token = Lex.getActualToken();
		token.addChar(String.valueOf(caracter));
		token.setId(Lex.returntokenNumberReservedWord(DISTINTO));
		Lex.setToken(token);
		Lex.incrementCursor();
	}

}
