package maki.languages.kotlin.ast

case class KtDeclaration(
  var propertyDeclaration: KtProperty = null,
  var functionDeclaration: KtFunction = null,
) extends ASTNode
