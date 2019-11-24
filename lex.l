%option noyywrap

%{
#include <stdio.h>
#include <string>
#include "node.h"
#include "grammar.tab.h"
%}

alpha      [a-zA-Z]
name       {alpha}([0-9]*{alpha}*)+
whitespace [ \t]

%%

{whitespace} ;
"fun"        { return FUNCTION; }
"Int"        { return INTEGER_DECL; }
{name}       { return NAME; }
"("          { return LEFT_PAREN; }
")"          { return RIGHT_PAREN; }
":"          { return COLON; }
"->"         { return RIGHT_ARROW; }
"{"          { return LEFT_BRACE; }
"}"          { return RIGHT_BRACE; }
[0-9]+       { return INTEGER_VAL; }
\n           { ++yylineno; }

%%
