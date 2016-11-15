

%token IF
%token THEN
%token ELSE
%token WHILE
%token DO
%token INT
%token REAL
%token BEGIN
%token END
%token DISTICT
%token CTE
%token ID
%token COMP

%%

/*Reglas gramaticales*/

/*Programa */

program 		: declaraciones sentencias ;

/* Declaraciones */

declaraciones	: declaraciones declaracion
				| declaracion ;
				
declaracion 	: tipo lista ;

tipo 			: INT ':'
				| REAL ':' ;
		
lista 			: lista ',' var 
				| var ;


var 			: ID ;
 

/* Sentencias */

sentencias 		: sentencias sentencia 
				| sentencia ;
			
sentencia   	: iteracion 
				| seleccion 
				| asignacion ;

bloque 			: BEGIN sentencias END ;

iteracion 		: WHILE condicion DO bloque ;

condicion 		: expresion COMP expresion ;

seleccion 		: IF cuerpoif ;

cuerpoif 		: condicion THEN bloque 
				| condicion THEN bloque ELSE bloque ;

asignacion 		: ID '=' expresion ;

expresion 		: expresion '+' termino 
				| expresion '-' termino 
				| termino;
			
termino 		: termino '*' factor 
				| termino '/' factor 
				| factor ;
		
factor 			: ID 
				| CTE ;

%%

void yyerror(String s)
{
 System.out.println("par:"+s);
}

int yylex()
{
String s;
int tok;
Double d;
 //System.out.print("yylex ");
 if (!st.hasMoreTokens())
 if (!newline)
 {
 newline=true;
 return '\n'; //So we look like classic YACC example
 }
 else
 return 0;
 s = st.nextToken();
 //System.out.println("tok:"+s);
 try
 {
 d = Double.valueOf(s);/*this may fail*/
 yylval = new ParserVal(d.doubleValue()); //SEE BELOW
 tok = NUM;
 }
 catch (Exception e)
 {
 tok = s.charAt(0);/*if not float, return char*/
 }
 return tok;
}

