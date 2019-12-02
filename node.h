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
  string id;
  Node *parent;
  vector<Node> children;
  // virtual llvm::Value* codeGen(CodeGenContext& context) {}
};

class Statement : public Node {
};

class Expression : public Node {
};

class Integer : public Expression {
public:
  int value;
  Integer(int value) : value(value) {}
  // virtual llvm::Value* codeGen(CodeGenContext& context) {};
};

class Assignment : public Expression {
public:
  Assignment() {

  }
};

class Function : public Expression {
public:
  string returnType;
  Function() {}
  Function(const char *id, const char *returnType) {
    this->id = id;
    this->returnType = returnType;
  }
};

class Lambda : public Function {
public:
  Lambda() {
  }
};
