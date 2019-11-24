#include <iostream>
#include <vector>
#include <string.h>
#include <llvm/IR/Value.h>

using namespace std;

class CodeGenContext;
class Statement;
class Expression;
class VariableDeclaration;

typedef std::vector<Statement*> StatementList;
typedef std::vector<Expression*> ExpressionList;
typedef std::vector<VariableDeclaration*> VariableList;

class Node {
public:
  virtual ~Node() {}
  virtual llvm::Value* codeGen(CodeGenContext& context) {}
};

class Statement : public Node {
};

class Expression : public Node {
};

class Integer : public Expression {
public:
  int value;
  Integer(int value) : value(value) {}
  virtual llvm::Value* codeGen(CodeGenContext& context) {};
};

class Function : public Expression {
public:
  string name;
  string returnType;
};
