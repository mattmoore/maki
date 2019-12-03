#pragma once

#include <iostream>
#include <vector>
#include <string.h>
#include <llvm/IR/Value.h>

class CodeGenContext;
class Statement;
class Expression;
class VariableDeclaration;

typedef std::vector<Statement*> StatementList;
typedef std::vector<Expression*> ExpressionList;
typedef std::vector<VariableDeclaration*> VariableList;

using namespace std;

namespace AST {
  class Node {
  public:
    virtual ~Node();
    string id;
    Node *parent;
    vector<Node> children;
    // virtual llvm::Value* codeGen(CodeGenContext &context) {}
  };

  class Statement : public Node {
  };

  class Expression : public Node {
  };

  class Value : public Node {
  };

  class Integer : public Value {
  public:
    int value;
    Integer(int value);
    // virtual llvm::Value* codeGen(CodeGenContext &context) {};
  };

  class String : public Value {
  public:
    const char *value;
    String(const char *value);
  };

  Value value(int x);
  Value value(const char *x);

  class Assignment : public Expression {
  public:
    const char *left;
    Value right;
    Assignment();
    Assignment(const char *left, const Value right);
  };

  class Function : public Expression {
  public:
    string returnType;
    Function();
    Function(const char *id, const char *returnType);
  };

  class Lambda : public Function {
  public:
    Lambda();
  };
}
