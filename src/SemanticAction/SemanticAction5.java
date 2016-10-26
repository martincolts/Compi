package SemanticAction;

import exe.Lex;
import exe.Token;

public class SemanticAction5 extends SemanticAction {

	@Override
	public void ejecutar(char caracter) {
		Token token = Lex.getActualToken();
		token.setId(Lex.returntokenNumberReservedWord(MENOR));
		Lex.setToken(token);
	}

}
