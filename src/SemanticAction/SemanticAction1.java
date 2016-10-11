package SemanticAction;

import exe.Token;

public class SemanticAction1 implements SemanticAction {

	@Override
	public void ejecutar(char caracter , Token token) {
		token = new Token ();
		token.addChar(String.valueOf(caracter));
		
	}

}
