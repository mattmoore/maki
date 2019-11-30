%option noyywrap

%{
#include <stdio.h>
#include <string>
#include "node.h"
#include "grammar.tab.h"
%}

alpha      [a-zA-Z]
id         {alpha}([0-9]*{alpha}*)+
string     \"([^\\\"]|\\.)*\"
whitespace [ \t]

%%

whitespace     {;}

  /* Keywords */
"var"          { yylval.string = strdup(yytext); return VAR; }
"val"          { yylval.string = strdup(yytext); return VAL; }
"fun"          { yylval.string = strdup(yytext); return FUN; }
"return"       { yylval.string = strdup(yytext); return RETURN; }

  /* Type Identifiers */
"Float"        { yylval.string = strdup(yytext); return FLOAT_TYPE; }
"Int"          { yylval.string = strdup(yytext); return INTEGER_TYPE; }
"String"       { yylval.string = strdup(yytext); return STRING_TYPE; }
"Double"       { yylval.string = strdup(yytext); return DOUBLE_TYPE; }

  /* Values */
[0-9]+\.[0-9]+ { yylval.integer = atof(yytext); return FLOAT; }
[0-9]+         { yylval.integer = atoi(yytext); return INTEGER; }
{string}       { yylval.string = strdup(yytext); return STRING; }

  /* Identifier */
{id}           { yylval.string = strdup(yytext); return ID; }

"\""           { yylval.string = strdup(yytext); return DOUBLE_QUOTE; }

  /* Arithmetic Operators */
"="            { yylval.string = strdup(yytext); return EQ; }
"+"            { yylval.string = strdup(yytext); return PLUS; }
"-"            { yylval.string = strdup(yytext); return MINUS; }
"*"            { yylval.string = strdup(yytext); return STAR; }
"/"            { yylval.string = strdup(yytext); return FORWARD_SLASH; }

  /* Symbols */
":"            { yylval.string = strdup(yytext); return COLON; }
"->"           { yylval.string = strdup(yytext); return RIGHT_ARROW; }

  /* Parentheses */
"("            { yylval.string = strdup(yytext); return LEFT_PAREN; }
")"            { yylval.string = strdup(yytext); return RIGHT_PAREN; }
"{"            { yylval.string = strdup(yytext); return LEFT_BRACE; }
"}"            { yylval.string = strdup(yytext); return RIGHT_BRACE; }

\n             { ++yylineno; }

%%
