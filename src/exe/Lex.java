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
	private static TransactionMatrix tm = new TransactionMatrix() ;
	public static final String EOF = "$";
	
	public Lex ( String code) {
		this.code = code+EOF ;
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
			if (wordInVector.toString().split("_")[0].equals(word)){
				return true ;
			}
		}
		return false ;
	}
	
	public static int returntokenNumberReservedWord (String word){
		for (String wordInVector : reservedWords){
			if (wordInVector.toString().split("_")[0].equals(word)){
				return Integer.parseInt(wordInVector.toString().split("_")[1]);
			}
		}
		return -1 ;
	}
	
	public static void setToken (Token token){
		tokensAcum.addElement(token);
	}
	
	public void tokenGenerator (){
		try {
			reservedWords  = new WordsFileLoader().loadReservedWords();
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (cursor < code.length()){
			tm.getNewState(code.substring(cursor, cursor+1));
		}
	}
	
	public void printTokens (){
		for (Token token : tokensAcum){
			System.out.println (token.getLexema()+" "+token.getId());
		}
	}
}
