package exe;

public class Token {
	
	private int id ;
	private String lexema = new String() ;
	private Object value ;
	
	public Token () {}
	
	public void addChar (String simbol){
		lexema.concat(simbol);
	}
	
	public void setId (int id){
		this.id = id ;
	}

	public int getId (){return id ;}
	
	public void setValue (Object o){
		this.value = o;
	}
	
	public Object getValue (){return value;}
	
	public String getLexema (){return lexema;}
}
