package SemanticAction;

import exe.Lex;
import exe.Token;

public class SemanticAction3 implements SemanticAction {

	
	
	@Override
	public void ejecutar(char caracter) {
		Token token = Lex.getActualToken();
		token.addChar(String.valueOf(caracter));
		
		if (Lex.isReservedWord(token.getLexema())){
			token.setId(Lex.returntokenNumberReservedWord(token.getLexema()));
			Lex.setToken(token);
		}
		
	}

}
