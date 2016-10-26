/*Declaraciones*/
% package gramatic ;

%token ID
%token IF
%token WHILE

%%

/*Reglas gramaticales*/

program : inicio fin ;
inicio : ID ;
fin : IF ;

%%