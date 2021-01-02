// Generated from Calc.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by CalcParser.
function CalcListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

CalcListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
CalcListener.prototype.constructor = CalcListener;

// Enter a parse tree produced by CalcParser#Add.
CalcListener.prototype.enterAdd = function(ctx) {
};

// Exit a parse tree produced by CalcParser#Add.
CalcListener.prototype.exitAdd = function(ctx) {
};


// Enter a parse tree produced by CalcParser#Mult.
CalcListener.prototype.enterMult = function(ctx) {
};

// Exit a parse tree produced by CalcParser#Mult.
CalcListener.prototype.exitMult = function(ctx) {
};


// Enter a parse tree produced by CalcParser#Hex.
CalcListener.prototype.enterHex = function(ctx) {
};

// Exit a parse tree produced by CalcParser#Hex.
CalcListener.prototype.exitHex = function(ctx) {
};


// Enter a parse tree produced by CalcParser#Int.
CalcListener.prototype.enterInt = function(ctx) {
};

// Exit a parse tree produced by CalcParser#Int.
CalcListener.prototype.exitInt = function(ctx) {
};



exports.CalcListener = CalcListener;