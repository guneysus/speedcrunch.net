grammar Calc;

startRule: 
    INT PLUS INT # BinaryAddInt
    ;

PLUS: 
    '+'
    ;

TIMES
    : 
    '*'
    ;

INT
    : 
    [0-9]+
    ;