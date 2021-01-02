grammar Calc;

startrule: 
    INT PLUS INT # BinaryAddInt
    | INT TIMES INT # BinaryMultiplyInt
    | INT MINUS INT # BinarySubstractInt
    | INT DIVISION INT # BinaryDivisionInt
    | INT MODULUS INT # BinaryModulusInt
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

MODULUS
    :
    '%'
    ;

INT
    : 
    [0-9]+
    ;