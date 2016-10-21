package exe;

import java.util.Vector;

public class Lex {
	
	private String code ;
	private static int cursor = 0 ;
	private static int lineCounter = 0 ;
	private static Token actualToken ;
	private static Vector<Token> tokensAcum = new Vector<Token>(); 
	
	public Lex ( String code) {
		this.code = code ;
	}
	
	public static Token getActualToken (){return actualToken;}
	
	public static void setActualToken (Token token){ actualToken = token ;}
	
	public static Vector<Token> getTokens(){ return tokensAcum ;}
	
	public void setCode (String code ){
		this.code = code ;
	}
	
	public String getCode (){
		return code ;
	}
	
	public static void incrementCursor (){cursor++;}
	
	public static void decrementCursor (){cursor--;}
	
	public static int getCursor (){return cursor ;}
	
	public static int lineCounter (){return lineCounter;}
	
	public void tokenGenerater (){
		
		while (cursor < code.length()){
			//recorrer el codigo y generar tokens
		}
		
	}
	
	
}
