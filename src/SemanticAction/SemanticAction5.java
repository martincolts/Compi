package SemanticAction;

import exe.Lex;
import exe.Token;

public class SemanticAction5 implements SemanticAction {

	@Override
	public void ejecutar(char caracter) {
		Token token = Lex.getActualToken();
		token.addChar(String.valueOf(caracter));
		token.setId(11);
		Lex.setToken(token);
	}

}
