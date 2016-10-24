package SemanticAction;

import exe.Lex;
import exe.Token;

public class SemanticAction4 implements SemanticAction {

	@Override
	public void ejecutar(char caracter) {
		Token token = Lex.getActualToken();
		token.addChar(String.valueOf(caracter));
		//TODO:Verificar el rango.
		token.setId(32);//32 id de una constante
		Lex.setToken(token);
	}

}
