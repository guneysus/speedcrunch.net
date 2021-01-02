include ../../../Makefile.in

default: debug

debug:
	echo "5-1" | $(GRUN) Calc startrule -tree -tokens -gui
	echo "-3-1" | $(GRUN) Calc startrule -tree -tokens -gui
	echo "5+1" | $(GRUN) Calc startrule -tree -tokens -gui
	echo "5--1" | $(GRUN) Calc startrule -tree -tokens -gui
	echo "5-+1" | $(GRUN) Calc startrule -tree -tokens -gui

.PHONY: default debug