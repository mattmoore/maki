// Generated from /Users/mattmoore/source/maki/src/main/antlr4/MakiParser.g4 by ANTLR 4.8
package maki;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MakiParser}.
 */
public interface MakiParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MakiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MakiParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MakiParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(MakiParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(MakiParser.OperationContext ctx);
}