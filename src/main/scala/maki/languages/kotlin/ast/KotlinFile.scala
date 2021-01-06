package maki.languages.kotlin.ast

case class KotlinFile(
    var topLevelObjects: Vector[KtTopLevelObject] = Vector.empty
) extends ASTNode
