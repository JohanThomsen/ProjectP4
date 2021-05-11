// Generated from C:/Git/P4/Project\g.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(gParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ctrlif}
	 * labeled alternative in {@link gParser#ctrlstruc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrlif(gParser.CtrlifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ctrlwhile}
	 * labeled alternative in {@link gParser#ctrlstruc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrlwhile(gParser.CtrlwhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ctrlfor}
	 * labeled alternative in {@link gParser#ctrlstruc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrlfor(gParser.CtrlforContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdcl(gParser.ClassdclContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methoddcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethoddcl(gParser.MethoddclContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(gParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(gParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathId}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathId(gParser.MathIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathNumber}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathNumber(gParser.MathNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathMult}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathMult(gParser.MathMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathDiv}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathDiv(gParser.MathDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathAdd}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathAdd(gParser.MathAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathParenthesis}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathParenthesis(gParser.MathParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolContains}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolContains(gParser.BoolContainsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolGE}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolGE(gParser.BoolGEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLess}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLess(gParser.BoolLessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolOr}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOr(gParser.BoolOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLE}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLE(gParser.BoolLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolNumber}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNumber(gParser.BoolNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(gParser.BoolNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolEquals}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolEquals(gParser.BoolEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringEquals}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringEquals(gParser.StringEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolMath}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolMath(gParser.BoolMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolId}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolId(gParser.BoolIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolAnd}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAnd(gParser.BoolAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolParanthesis}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolParanthesis(gParser.BoolParanthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolGreater}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolGreater(gParser.BoolGreaterContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(gParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodcall(gParser.MethodcallContext ctx);
}