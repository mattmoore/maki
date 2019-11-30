#include <iostream>
#include <llvm/IR/LLVMContext.h>
#include <llvm/IR/Module.h>
#include <llvm/IR/Function.h>
#include <llvm/IR/PassManager.h>
#include <llvm/IR/CallingConv.h>
#include <llvm/IR/Verifier.h>
#include <llvm/IR/IRBuilder.h>
#include <llvm/Support/raw_ostream.h>
#include <llvm/Support/FileSystem.h>
#include <llvm/Support/ToolOutputFile.h>
#include <llvm/Bitcode/BitcodeWriter.h>

extern int yyparse();
extern int yyerror(const char *);
extern int yylex();
extern int yylineno;

using namespace std;
using namespace llvm;

void compile() {
  static LLVMContext context;
  Module *module = new Module("test", context);
  IRBuilder<> builder(context);

  FunctionType *funcType = FunctionType::get(
    builder.getInt32Ty(),
    false
  );
  Function *mainFunc = Function::Create(
    funcType,
    Function::ExternalLinkage,
    "main",
    module
  );
  BasicBlock *entry = BasicBlock::Create(context, "entry", mainFunc);
  builder.SetInsertPoint(entry);

  Value *helloWorld = builder.CreateGlobalStringPtr("hello world!\n");

  vector<Type *> putsArgs;
  putsArgs.push_back(builder.getInt8Ty()->getPointerTo());
  ArrayRef<Type *> argsRef(putsArgs);

  FunctionType *putsType = FunctionType::get(
    builder.getInt32Ty(),
    argsRef,
    false
  );
  FunctionCallee putsFunc = module->getOrInsertFunction("puts", putsType);

  builder.CreateCall(putsFunc, helloWorld);
  builder.CreateRetVoid();

  error_code ec;
  ToolOutputFile file("hello.bc", ec, sys::fs::F_None);
  WriteBitcodeToFile(*module, file.os());
  file.keep();

  module->print(llvm::errs(), nullptr);
}

int main(int argc, char** argv) {
  int result = yyparse();

  if (result == 0)
    cout << "THE INPUT IS VALID." << endl;
  else
    cout << "THE INPUT IS INVALID." << endl;
  cout << "Line count: " << yylineno << endl;

  compile();
}
