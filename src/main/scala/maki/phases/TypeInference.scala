package maki.phases

import maki.AST
import maki.languages.antlr.kotlin.KotlinParser.PropertyDeclarationContext
import maki.languages.kotlin.ast.{KtFunction, KtProperty}

object TypeInference extends Phase {
  def apply(ast: AST): AST =
    ast match {
      case property: KtProperty => inferPropertyType(property)
      case function: KtFunction => inferFunctionType(function)
      case _ => ast
    }

  private def inferPropertyType(ktProperty: KtProperty): KtProperty = {
    val IntPattern = "\\d+".r
    val StringPattern = """^".*"$""".r
    val inferredType = ktProperty.parserRuleContext.asInstanceOf[PropertyDeclarationContext].expression.getText match {
      case IntPattern() => "Int"
      case StringPattern() => "String"
    }
    ktProperty.copy(dataType = inferredType)
  }

  private def inferFunctionType(ktFunction: KtFunction): KtFunction = {
    val IntPattern = "\\d+".r
    val StringPattern = """^".*"$""".r
    val inferredType = ktFunction.parserRuleContext.asInstanceOf[PropertyDeclarationContext].expression.getText match {
      case IntPattern() => "Int"
      case StringPattern() => "String"
    }
    ktFunction.copy(`type` = inferredType)
  }
}
