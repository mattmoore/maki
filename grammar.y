%{
  #include "node.h"

  using namespace std;

  extern int yylex();
  extern const char *yytext;
  extern const char *yyval;
  void yyerror(const char *s) { printf("ERROR: %s\n", s); }

  Function f;
%}

%union {
  char *sval;
}

%token <sval> FUNCTION
%token <sval> NAME
%token <sval> LEFT_PAREN
%token <sval> RIGHT_PAREN
%token <sval> COLON
%token <sval> INTEGER_DECL
%token <sval> RIGHT_ARROW
%token <sval> LEFT_BRACE
%token <sval> RIGHT_BRACE
%token <sval> INTEGER_VAL

%start program

%%

program: FUNCTION signature returnType LEFT_BRACE
           body
         RIGHT_BRACE
;

signature:
  NAME {
    f.name = yytext;
    cout << "Function name: " << f.name << endl;
  }
  LEFT_PAREN { cout << "START parameter list" << endl; }
  parameters
  RIGHT_PAREN { cout << "END parameter list" << endl; }

parameters:
  %empty

returnType:
  %empty | COLON INTEGER_DECL {
    f.returnType = yytext;
    cout << f.returnType << endl;
  }

body:
  %empty | INTEGER_VAL {
    Integer intValue(atol(yytext));
    cout << intValue.value << endl;
  }

%%
