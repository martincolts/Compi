package exe;

import java.io.IOException;
import java.util.Vector;

import Properties.WordsFileLoader;

public class Lex {
	
	private String code ;
	private static int cursor = 0 ;
	private static int lineCounter = 0 ;
	private static Token actualToken ;
	private static Vector<Token> tokensAcum = new Vector<Token>(); 
	private static Vector<String> reservedWords ;
	
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
	
	public static boolean isReservedWord (String word){
		for (String wordInVector : reservedWords){
			if (wordInVector.split(".")[0].equals(word)){
				return true ;
			}
		}
		return false ;
	}
	
	public static int returntokenNumberReservedWord (String word){
		for (String wordInVector : reservedWords){
			if (wordInVector.split(".")[0].equals(word)){
				return Integer.parseInt(wordInVector.split(".")[1]);
			}
		}
		return -1 ;
	}
	
	public static void setToken (Token token){
		tokensAcum.addElement(token);
	}
	
	public void tokenGenerater (){
		try {
			reservedWords  = new WordsFileLoader().loadReservedWords();
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (cursor < code.length()){
			//recorrer el codigo y generar tokens
		}
	}
	
	
}
