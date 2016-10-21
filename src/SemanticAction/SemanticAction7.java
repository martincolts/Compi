package SemanticAction;

import exe.Lex;
import exe.Token;

public class SemanticAction7 implements SemanticAction {

	@Override
	public void ejecutar(char caracter) {
		Token token = new Token() ;
		token.addChar(String.valueOf(caracter));
		token.setId(-1);//TODO: depende del simbolo, crear una tabla.
		Lex.setToken(token);
	}

}
