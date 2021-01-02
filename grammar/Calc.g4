grammar Calc;

startRule: 
    INT PLUS INT # BinaryAddInt
    | INT TIMES INT # BinaryMultiplyInt
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