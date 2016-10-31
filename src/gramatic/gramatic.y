/*Declaraciones*/
% package gramatic ;




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

%%

/*Reglas gramaticales*/

/*Programa */
program : declaraciones sentencias ;

/* Declaraciones */
declaraciones: declaraciones declaracion | declaracion;
declaracion : tipo lista ;
tipo : INT ':'| REAL ':'
lista : lista var | var ;
var : ID ; 
inicio : ID ;

/* Sentencias */

sentencias : IF ;

%%