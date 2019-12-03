#ifndef Node_H
#define Node_H
#include "node.h"
#endif

namespace AST {
  Node::~Node() {

  }

  Integer::Integer(int value) {
    this->value = value;
  }

  String::String(const char *value) {
    this->value = value;
  }

  Value value(int x) {
    return AST::Integer(x);
  }

  Value value(const char * x) {
    return AST::String(x);
  }

  Assignment::Assignment() {}

  Assignment::Assignment(const char *left, const Value right) {
    this->left = left;
    this->right = right;
  }

  Function::Function() {}

  Function::Function(const char *id, const char *returnType) {
    this->id = id;
    this->returnType = returnType;
  }

  Lambda::Lambda() {}
}
