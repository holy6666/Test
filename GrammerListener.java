// Generated from java-escape by ANTLR 4.11.1
package com.example.demo.grammer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammerParser}.
 */
public interface GrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#dec1}.
	 * @param ctx the parse tree
	 */
	void enterDec1(GrammerParser.Dec1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#dec1}.
	 * @param ctx the parse tree
	 */
	void exitDec1(GrammerParser.Dec1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(GrammerParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(GrammerParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#classheader}.
	 * @param ctx the parse tree
	 */
	void enterClassheader(GrammerParser.ClassheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#classheader}.
	 * @param ctx the parse tree
	 */
	void exitClassheader(GrammerParser.ClassheaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(GrammerParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(GrammerParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterSymbols(GrammerParser.SymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitSymbols(GrammerParser.SymbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GrammerParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GrammerParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#identifire}.
	 * @param ctx the parse tree
	 */
	void enterIdentifire(GrammerParser.IdentifireContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#identifire}.
	 * @param ctx the parse tree
	 */
	void exitIdentifire(GrammerParser.IdentifireContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(GrammerParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(GrammerParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(GrammerParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(GrammerParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammerParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammerParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#funcheader}.
	 * @param ctx the parse tree
	 */
	void enterFuncheader(GrammerParser.FuncheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#funcheader}.
	 * @param ctx the parse tree
	 */
	void exitFuncheader(GrammerParser.FuncheaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(GrammerParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(GrammerParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(GrammerParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(GrammerParser.ArgContext ctx);
}