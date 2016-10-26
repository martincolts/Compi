package SemanticAction;

public abstract class SemanticAction {
	
	protected static final String ID = "ID" ;
	protected static final String CTE = "CTE" ;
	protected static final String DISTINTO = "<>" ;
	protected static final String MENOR = "<" ;
	
	public abstract void ejecutar (char caracter);
	
	/*
	  AS1: Inicializar el token, empaquetar el token leido, consumir el caracter.
	  AS2: Agregar el caracter al token, consumir el caracter
	  AS3: Empaquetar y devolver el token, verificar si es palabra reservada, verificar el largo del identificador, no consumir el caracter.
	  AS4: Empaquetar el token, verificar el rango, 
	  AS5: Empaquetar el token, no consumir el caracter.
	  AS6: Empaqueta le token, consumir el caracter.
	  AS7: Inicializa el token, lo empaqueta, consume el caracter.
	*/

}
