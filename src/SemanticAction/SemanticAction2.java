package SemanticAction;

import exe.Lex;
import exe.Token;

public class SemanticAction2 implements SemanticAction {

	@Override
	public void ejecutar(char caracter) {
		Token token = Lex.getActualToken();
		token.addChar(String.valueOf(caracter));
		Lex.setActualToken(token);
		token.getLexema();
		Lex.incrementCursor();
	}
	
	

}
