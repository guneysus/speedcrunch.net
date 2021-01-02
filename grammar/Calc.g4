grammar Calc;

startrule: binaryexpression (EOF)?;

binaryexpression:
	INT PLUS INT		# BinaryAddInt
    | INT INT           # BinaryAddSimple
	| INT TIMES INT		# BinaryMultiplyInt
	| INT MINUS INT		# BinarySubstractInt
	| INT DIVISION INT	# BinaryDivisionInt
	| INT MODULUS INT	# BinaryModulusInt;

signedatom: PLUS signedatom | MINUS signedatom;

PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVISION: '/';
MODULUS: '%';

INT: NUMBER;

fragment NUMBER: (SIGN)? DIGIT (DIGIT+)?;

fragment DIGIT: [0-9];

fragment SIGN: ('+' | '-');

WS: [ \r\n\t]+ -> skip;