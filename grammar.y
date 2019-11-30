%{
  #include "node.h"

  using namespace std;

  extern int yylex();
  extern const char *yytext;
  extern const char *yyval;
  void yyerror(const char *s) { printf("ERROR: %s\n", s); }

  Node root;
%}

%union {
  int integer;
  long longVal;
  char *string;
}

// Keywords
%token <string> ID
%token <string> VAR
%token <string> VAL
%token <string> FUN

// Type Identifiers
%token STRING_TYPE
%token INTEGER_TYPE
%token FLOAT_TYPE
%token DOUBLE_TYPE

// Type Values
%token <integer> INTEGER
%token <longVal> LONG
%token DOUBLE
%token FLOAT
%token <string> STRING

// Arithmetic Operators
%token <string> EQ
%token PLUS
%token MINUS
%token STAR
%token FORWARD_SLASH

// Symbols
%token COLON
%token DOUBLE_QUOTE
%token SINGLE_QUOTE
%token RIGHT_ARROW

// Parentheses
%token LEFT_PAREN
%token RIGHT_PAREN
%token LEFT_BRACE
%token RIGHT_BRACE
%token RETURN

// Newline
%token NEWLINE

// Precedence
%precedence EQ
%left MINUS PLUS
%left STAR FORWARD_SLASH

%start expr_list

%%

value:
    INTEGER
  | FLOAT
  | STRING

type:
    FLOAT_TYPE
  | INTEGER_TYPE
  | STRING_TYPE

assignment:
  VAR ID EQ INTEGER
  {
    $<integer>$ = $<integer>4;
  }

function:
  FUN ID LEFT_PAREN RIGHT_PAREN COLON type LEFT_BRACE
    expr_list
    RETURN expr
  RIGHT_BRACE
  {
    Function f($2, $<string>6);
    f.parent = &root;
    root.children.push_back(f);
  }

arithmetic:
    expr PLUS expr
    { $<integer>$ = $<integer>1 + $<integer>3; }
  | expr MINUS expr
    { $<integer>$ = $<integer>1 - $<integer>3; }
  | expr STAR expr
    { $<integer>$ = $<integer>1 * $<integer>3; }
  | expr FORWARD_SLASH expr
    { $<integer>$ = $<integer>1 / $<integer>3; }
  | LEFT_PAREN expr RIGHT_PAREN
    { $<integer>$ = $<integer>2; }

expr_list:
    %empty
  | expr expr_list
;

expr:
    value
  | assignment
  | function
  | arithmetic
;

%%
