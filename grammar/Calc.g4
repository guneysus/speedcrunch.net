grammar Calc;

startRule: expression;

expression     : addition;
addition       : multiplication ((PLUS|MINUS|MODULUS|POW) multiplication)* ;
multiplication : atom ((TIMES|DIV) atom)* ;
atom           : NUMBER ;

// expression : expression '*' expression
//            | expression '+' expression                      
//            | atom
//            ;
// atom           : NUMBER ;           

NUMBER: DIGITS;

PLUS: '+';
MINUS: '-';
TIMES: '*';
POW: '^';
DIV: '/';
MODULUS: '%';

DIGITS: DIGIT (DIGIT+)?;

DIGIT: [0-9];

SIGN: ('+' | '-');

WS: [ \r\n\t]+ -> skip;