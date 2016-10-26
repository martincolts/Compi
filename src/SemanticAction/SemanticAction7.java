package SemanticAction;

import exe.Lex;
import exe.Token;

public class SemanticAction7 extends SemanticAction {

	@Override
	public void ejecutar(char caracter) {
		Token token = new Token() ;
		token.addChar(String.valueOf(caracter));
		token.setId(Lex.returntokenNumberReservedWord(token.getLexema()));
		Lex.setToken(token);
		Lex.incrementCursor();
	}

}
