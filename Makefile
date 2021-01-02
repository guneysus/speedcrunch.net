include Makefile.in

default:

all: java cs js py

java: Java
cs: CSharp
js: JavaScript
py: Python3

CSharp:
	$(ANTLR) $(GRAMMAR) -Dlanguage=$@ -visitor -o src/SpeedCrunch.Net/NCrunch/grammar
	
Java:
	$(ANTLR) $(GRAMMAR) -Dlanguage=$@ -visitor -o $(OUTPUT)/$@/
	$(JAVAC) $(OUTPUT)/$@/*.java
	
JavaScript:
	$(ANTLR) $(GRAMMAR) -Dlanguage=$@ -visitor -o $(OUTPUT)/$@/


Python3:
	$(ANTLR) $(GRAMMAR) -Dlanguage=$@ -visitor -o $(OUTPUT)/$@/
	
debug:
	$(MAKE) default -C $(OUTPUT)/Java
	
.PHONY: default all java Java js JavaScript cs CSharp py Python3 debug
