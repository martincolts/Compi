package exe;

import java.io.IOException;
import java.util.Vector;
import java.util.regex.Pattern;

import Properties.WordsFileLoader;

public class TransactionMatrix {

	private static final String NUMBER = "NUMBER";
	private static final String DIGIT = "DIGIT" ;
	private static final String ENDLINE = "ENDLINE" ;
	private static final String TAB = "TAB" ;
	private static final String SPACE = "SPACE" ;
	private static final String MENOR = "<" ;
	private static final String MAYOR = ">" ;
	private static final String IGUAL = "=" ;
	private static final String MAS = "+" ;
	private static final String MENOS = "-" ;
	private static final String DIV = "/" ;
	private static final String POR = "*" ;
	private static final String DOS_PUNTOS = ":";
	public static int actualState = 0 ;
	public static int state = 0 ;

	public static final String simbols [] = {DIGIT,NUMBER,MENOR,MAYOR,IGUAL,MAS,MENOS,DIV,POR,DOS_PUNTOS,ENDLINE,TAB,SPACE};

	public static final int[][] matrix = 	{	
			{1,2,3,0,0,0,0,0,0,4,0,0,0},
			{1,1,0,0,0,0,0,0,0,0,0,0,0},
			{0,2,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0}, //0 = Estado final.
			{0,0,0,0,0,0,0,0,0,0,0,0,0}
	};

	public TransactionMatrix (){}

	public int transact (char state , char simbol ){
		return matrix[state][simbol];
	}
	
	public static Vector<String> getReservedWords (){return reservedWords;}

	public String getSimbol (CharSequence simbol){

		Pattern patNumber = Pattern.compile("[0-9]");
		Pattern patDigit = Pattern.compile("[a-zA-Z]");
		Pattern space = Pattern.compile ("\\s");
		Pattern tab = Pattern.compile ("\\t");
		Pattern endLine = Pattern.compile ("\\r\\n");

		if (patNumber.matcher(simbol).matches())
			return NUMBER;
		else
			if (patDigit.matcher(simbol).matches())
				return DIGIT ;
			else
				if (tab.matcher(simbol).matches())
					return TAB ;
				else
					if (space.matcher(simbol).matches())
						return SPACE ;
					else
						if (endLine.matcher(simbol).matches())
							return ENDLINE ;
		return simbol.toString();
	}

	public int getSimbolState (String simbol){
		String s = getSimbol(simbol);
		int count = 0 ;
		while ((count < simbols.length)&&(!s.equals(simbols[count]))){
			count++;
		}
		if ( count != simbols.length)
			return count ;
		else
			return -1 ;
	}

	public int getNewState (String simbol){
		int colum = getSimbolState (simbol) ;
		if (colum != -1)
			return matrix [actualState] [colum] ;
		else 
			return 0 ;
	}
}
