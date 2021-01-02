grammar Calc;

e   : e '*' e # Mult
    | e '+' e # Add
    | INT # Int
    | HEX # Hex
    ;


INT: [0-9]+;
HEX:  '0x'([0-9a-fA-F])+;