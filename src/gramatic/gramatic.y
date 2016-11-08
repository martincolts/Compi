


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
program : declaraciones sentencias ;

/* Declaraciones */
declaraciones: declaraciones declaracion | declaracion ';';
declaracion : tipo lista ;
tipo : INT ':'| REAL ':'
lista : lista var | var ;
var : ID ; 
inicio : ID ;

/* Sentencias */

sentencias : sentencias sentencia | sentencia ';';
sentencia : bloque | iteracion | seleccion | asignacion |;

bloque : BEGIN sentencias END ;

iteracion : WHILE condicion DO bloque ;

condicion : expresion COMP expresion ;

seleccion : IF cuerpoIf ;
cuerpoIf : condicion THEN bloque | condicion THEN bloque ELSE bloque ;

asignacion : ID '=' expresion ;
expresion : expresion '+' termino | expresion '-' termino | termino;
termino : termino '*' factor | termino '/' factor | factor;
factor : ID | CTE ;

%%