package maki.languages.kotlin

import maki.AST
import maki.languages.antlr.kotlin.{KotlinParser, KotlinParserBaseVisitor}
import maki.languages.kotlin.ast._
import maki.phases.TypeInference
import org.antlr.v4.runtime.tree.{ParseTree, ParseTreeProperty}

import java.util.Optional

object Visitor {
  def apply(tree: ParseTree): Visitor = new Visitor {
    visit(tree)
  }
}

class Visitor extends KotlinParserBaseVisitor[AST] {
  var ast: AST = KotlinFile()
  var symbolTable = new ParseTreeProperty[AST]

  override def visitKotlinFile(ctx: KotlinParser.KotlinFileContext): AST = {
    symbolTable.put(ctx, ast)
    ctx.topLevelObject.forEach(topLevelObject => visitTopLevelObject(topLevelObject))
    super.visitKotlinFile(ctx)
  }

  override def visitTopLevelObject(ctx: KotlinParser.TopLevelObjectContext): AST = {
    val topLevelObject = new TopLevelObject {
      parserRuleContext = ctx
      parent = symbolTable.get(ctx.parent)
    }
    symbolTable.put(ctx, topLevelObject)
    symbolTable.get(ctx.parent).children.addOne(topLevelObject)
    visitDeclaration(ctx.declaration)
    super.visitTopLevelObject(ctx)
  }

  override def visitDeclaration(ctx: KotlinParser.DeclarationContext): AST = {
    val declaration = new KtDeclaration {
      parserRuleContext = ctx
      parent = symbolTable.get(ctx.parent)
    }
    symbolTable.put(ctx, declaration)
    symbolTable.get(ctx.parent).children.addOne(declaration)
    if (ctx.propertyDeclaration != null) visitPropertyDeclaration(ctx.propertyDeclaration)
    else if (ctx.functionDeclaration != null) visitFunctionDeclaration(ctx.functionDeclaration)
    else if (ctx.classDeclaration != null) visitClassDeclaration(ctx.classDeclaration)
    super.visitDeclaration(ctx)
  }

  override def visitPropertyDeclaration(ctx: KotlinParser.PropertyDeclarationContext): AST = {
    val property =
      TypeInference(
        new KtProperty(
          name = ctx.variableDeclaration.simpleIdentifier.getText,
          expression = ctx.expression.getText,
          dataType = Option(ctx.variableDeclaration.`type`).map(_.getText).getOrElse(null)
        ) {
          parserRuleContext = ctx
          parent = symbolTable.get(ctx.parent)
        }
      )
    symbolTable.put(ctx, property)
    symbolTable.get(ctx.parent).children.addOne(property)
    super.visitPropertyDeclaration(ctx)
  }

  override def visitFunctionDeclaration(ctx: KotlinParser.FunctionDeclarationContext): AST = {
    val function =
      new KtFunction(
        name = ctx.simpleIdentifier.getText,
        `type` = Optional.ofNullable(ctx.`type`).map(_.getText).orElse(""),
        functionBody = null
      ) {
        parserRuleContext = ctx
        parent = symbolTable.get(ctx.parent)
      }
    symbolTable.put(ctx, function)
    visitFunctionBody(ctx.functionBody)
    symbolTable.get(ctx.parent).children.addOne(function)
    super.visitFunctionDeclaration(ctx)
  }

  override def visitFunctionBody(ctx: KotlinParser.FunctionBodyContext): AST = {
    val functionBody = new KtFunctionBody() {
      parserRuleContext = ctx
      parent = symbolTable.get(ctx.parent)
    }
    symbolTable.get(ctx.parent).asInstanceOf[KtFunction].functionBody = functionBody
//    symbolTable.put(ctx.parent, function.copy(functionBody = functionBody))
    symbolTable.put(ctx, functionBody)
    if (ctx.expression != null) visitExpression(ctx.expression)
    super.visitFunctionBody(ctx)
  }

  override def visitExpression(ctx: KotlinParser.ExpressionContext): AST = {
    val expression = new KtExpression() {
      parserRuleContext = ctx
      parent = symbolTable.get(ctx.parent)
    }
    symbolTable.put(ctx, expression)
    symbolTable.get(ctx.parent).children.addOne(expression)
    super.visitExpression(ctx)
  }

  override def visitBlock(ctx: KotlinParser.BlockContext): AST = {
    super.visitBlock(ctx)
  }

  override def visitStatement(ctx: KotlinParser.StatementContext): AST = {
    super.visitStatement(ctx)
  }
}
