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

//operadores
NAO: 'nao' | '!';
E: 'e';
OU: 'ou';
MULT: '*';
DIV: '/';
ADC: '+';
SUB: '-';
INCR: '++';
DECR: '--';
OPL: '>' | '<' | '<=' | '==' | '!=' | '>=';
ATRIBUICAO: '=';

//Terminais principais
ID:  [a-zA-Z][a-zA-Z0-9]*;
DIG: '-'?[0-9]+;
NREAL: [0-9]+'.'[0-9]+ | '-'?[0-9]+'.'[0-9]+;
WS: [ \n\t]+ -> skip;
CADEIA: '"' [a-zA-Z]+ '"';


//regras de produção para declaração de variaveis
variavel: variavel_crtr | variavel_int | variavel_real | variavel_sem_atribuicao;
variavel_sem_atribuicao: (CARACTERE|INTEIRO|REAL) ID';';
variavel_int: INTEIRO ID ATRIBUICAO DIG';';
variavel_real: REAL ID ATRIBUICAO NREAL';';
variavel_crtr: CARACTERE ID ATRIBUICAO';';

//regra de produção para condicional if
instrucao_de_controle: if_statement;
if_statement: SE '(' expressao OPL expressao ')''{' (expressao)+ '}'SENAO? '{'(expressao)+'}';
expressao: exp_atribuicao | exp_imprima;
exp_atribuicao: ID ATRIBUICAO (exp_aritmetica)*';';
exp_imprima: IMPRIMA '('ID')';
exp_aritmetica: DIG (op_arit DIG)+ ';';
op_arit: ADC | SUB | MULT | DIV;