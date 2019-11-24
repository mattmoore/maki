#include <iostream>
#include <llvm/IR/Module.h>
#include <llvm/IR/Function.h>
#include <llvm/IR/PassManager.h>
#include <llvm/IR/CallingConv.h>
#include <llvm/IR/Verifier.h>
#include <llvm/IR/IRBuilder.h>
#include <llvm/Support/raw_ostream.h>

extern int yyparse();
extern int yyerror(const char *);
extern int yylex();
extern int yylineno;

using namespace std;
using namespace llvm;

int main(int argc, char** argv) {
  int result = yyparse();
  if (result == 0)
    cout << "The input is valid." << endl;
  else
    cout << "The input is invalid." << endl;
  cout << "Line count: " << yylineno << endl;
}
