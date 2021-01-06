package maki.languages.kotlin.ast

case class KtTopLevelObject(
  var declaration: KtDeclaration = null
) extends ASTNode
