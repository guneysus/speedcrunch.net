grammar Calc;

startRule: 
    INT PLUS INT # BinaryAddInt
    | INT TIMES INT # BinaryMultiplyInt
    | INT MINUS INT # BinarySubstractInt
    | INT DIVISION INT # BinaryDivisionInt
    ;

PLUS: 
    '+'
    ;

TIMES
    : 
    '*'
    ;

MINUS
    : 
    '-'
    ;

DIVISION
    : 
    '/'
    ;    

INT
    : 
    [0-9]+
    ;