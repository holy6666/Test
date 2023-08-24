// Generated from java-escape by ANTLR 4.11.1
package com.example.demo.grammer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GrammerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#dec1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec1(GrammerParser.Dec1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(GrammerParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#classheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassheader(GrammerParser.ClassheaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(GrammerParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GrammerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbols(GrammerParser.SymbolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GrammerParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#identifire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifire(GrammerParser.IdentifireContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(GrammerParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(GrammerParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GrammerParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammerParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#funcheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncheader(GrammerParser.FuncheaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(GrammerParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(GrammerParser.ArgContext ctx);
}