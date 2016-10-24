package SemanticAction;

import exe.Lex;
import exe.Token;

public class SemanticAction3 implements SemanticAction {
	
	@Override
	public void ejecutar(char caracter) {
		//TODO: Verificar el rango del identificador.
		Token token = Lex.getActualToken();
		if (Lex.isReservedWord(token.getLexema())){
			token.setId(Lex.returntokenNumberReservedWord(token.getLexema()));
			Lex.setToken(token);
		}
		else{
			token.setId (-1);
			Lex.setToken(token);
		}
	}
	

}
