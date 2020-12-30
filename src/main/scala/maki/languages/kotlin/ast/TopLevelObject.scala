package maki.languages.kotlin.ast

import maki.AST

case class TopLevelObject(
  declaration: KtDeclaration = null
) extends AST
