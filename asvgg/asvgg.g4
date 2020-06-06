grammar asvgg;
//Palavras reservadas
SE: 'se' ;
SENAO: 'senao';
INTEIRO: 'intr';
REAL: 'real';
CARACTERE: 'crtr';
RETORNE: 'retorne';
VAZIA: 'vazia' ;
ENQUANTO: 'enquanto';
PARA: 'para';
IMPRIMA: 'imprima';

//operadores aritmeticos
MULT: '*';
DIV: '/';
ADC: '+';
SUB: '-';
ATRIBUICAO: '=';

TERMINO: ';'; // indica o fim da expressao

//operadores logicos
OPL: MAIOR | MENOR | MENOR_IGUAL | IGUAL | DIFERENTE | MAIOR_IGUAL;
NAO: 'nao' | '!';
E: 'e';
OU: 'ou';
IGUAL: '==';
MENOR_IGUAL: '<=';
MENOR: '<';
MAIOR_IGUAL: '>=';
MAIOR: '>';
DIFERENTE: '!=';


//Terminais principais
ID:  [a-zA-Z][a-zA-Z0-9]*;
WS: [ \n\t]+ -> skip;
CADEIA: '"' [a-zA-Z]+ '"';
NUMEROS: DIG | NREAL;
DIG: '-'?[0-9]+;
NREAL: [0-9]+'.'[0-9]+ | '-'?[0-9]+'.'[0-9]+;

//regras de produção para declaração de variaveis
variavel: variavel_crtr | variavel_int | variavel_real | variavel_sem_atribuicao;
variavel_sem_atribuicao: (CARACTERE|INTEIRO|REAL) ID TERMINO;
variavel_int: INTEIRO ID ATRIBUICAO DIG TERMINO;
variavel_real: REAL ID ATRIBUICAO NREAL TERMINO;
variavel_crtr: CARACTERE ID ATRIBUICAO TERMINO;

//regra de produção para condicional if
instrucao_de_controle: if_statement | for_statement | while_statement;
if_statement: SE '(' ID OPL expressao ')' '{' (expressao)+ '}'(SENAO '{'(expressao)+'}')?;
for_statement: PARA '(' (expressao)+ ')' '{' (expressao)+ '}';
while_statement: ENQUANTO '(' ID OPL expressao ')''{' (expressao)+ '}';
expressao: exp_atribuicao | exp_imprima | exp_aritmetica | ID | NUMEROS;
exp_atribuicao: ID ATRIBUICAO (exp_aritmetica)* TERMINO?;
exp_imprima: IMPRIMA '('ID')' TERMINO;
exp_aritmetica: (NUMEROS|ID) (op_arit (NUMEROS|ID))+ TERMINO?;
op_arit: ADC | SUB | MULT | DIV | ATRIBUICAO;