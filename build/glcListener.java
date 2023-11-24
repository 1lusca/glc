// Generated from glc.g by ANTLR 4.13.1

	// imports
	import java.util.HashMap;
	import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link glcParser}.
 */
public interface glcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link glcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(glcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(glcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(glcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(glcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(glcParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(glcParser.AttributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#aritmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterAritmetic_expression(glcParser.Aritmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#aritmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitAritmetic_expression(glcParser.Aritmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(glcParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(glcParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterIteration(glcParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitIteration(glcParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link glcParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(glcParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link glcParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(glcParser.Relational_expressionContext ctx);
}