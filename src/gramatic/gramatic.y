/*Declaraciones*/
% package gramatic ;

%token ID
%token IF
%token WHILE
%token INT
%token REAL

%%

/*Reglas gramaticales*/

program : declaraciones sentencias ;
declaraciones: declaraciones declaracion | declaracion;
declaracion : tipo lista ;
tipo : INT ':'| REAL ':'
lista : lista var | var ;
var : ID ; 
inicio : ID ;
fin : IF ;

%%