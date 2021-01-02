ANTLR_PATH := D:\bin\java\antlr-4.9-complete.jar
export CLASSPATH=$(ANTLR_PATH)

ANTLR := java org.antlr.v4.Tool
GRUN  := java org.antlr.v4.gui.TestRig

NAME 	= Calc
GRAMMAR = Calc.g4
LEXER 	= $(NAME)Lexer.g4	
PARSER 	= $(NAME)Parser.g4	
OUTPUT	= dist

default:

all: java cs js py

java: Java
cs: CSharp
js: JavaScript
py: Python3

CSharp Java:
	$(ANTLR) $(GRAMMAR) -Dlanguage=$@ -visitor -o $(OUTPUT)/$@/

JavaScript:
	$(ANTLR) $(GRAMMAR) -Dlanguage=$@ -visitor -o $(OUTPUT)/$@/

Python3:
	$(ANTLR) $(GRAMMAR) -Dlanguage=$@ -visitor -o $(OUTPUT)/$@/
	
.PHONY: default all java Java js JavaScript cs CSharp py Python3
