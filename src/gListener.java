// Generated from C:/Git/P4/Project\g.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(gParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(gParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctrlif}
	 * labeled alternative in {@link gParser#ctrlstruc}.
	 * @param ctx the parse tree
	 */
	void enterCtrlif(gParser.CtrlifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctrlif}
	 * labeled alternative in {@link gParser#ctrlstruc}.
	 * @param ctx the parse tree
	 */
	void exitCtrlif(gParser.CtrlifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctrlwhile}
	 * labeled alternative in {@link gParser#ctrlstruc}.
	 * @param ctx the parse tree
	 */
	void enterCtrlwhile(gParser.CtrlwhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctrlwhile}
	 * labeled alternative in {@link gParser#ctrlstruc}.
	 * @param ctx the parse tree
	 */
	void exitCtrlwhile(gParser.CtrlwhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctrlfor}
	 * labeled alternative in {@link gParser#ctrlstruc}.
	 * @param ctx the parse tree
	 */
	void enterCtrlfor(gParser.CtrlforContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctrlfor}
	 * labeled alternative in {@link gParser#ctrlstruc}.
	 * @param ctx the parse tree
	 */
	void exitCtrlfor(gParser.CtrlforContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classdcl}.
	 * @param ctx the parse tree
	 */
	void enterClassdcl(gParser.ClassdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classdcl}.
	 * @param ctx the parse tree
	 */
	void exitClassdcl(gParser.ClassdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methoddcl}.
	 * @param ctx the parse tree
	 */
	void enterMethoddcl(gParser.MethoddclContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methoddcl}.
	 * @param ctx the parse tree
	 */
	void exitMethoddcl(gParser.MethoddclContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(gParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(gParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(gParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(gParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathId}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMathId(gParser.MathIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathId}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMathId(gParser.MathIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathNumber}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMathNumber(gParser.MathNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathNumber}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMathNumber(gParser.MathNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathMult}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMathMult(gParser.MathMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathMult}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMathMult(gParser.MathMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathDiv}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMathDiv(gParser.MathDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathDiv}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMathDiv(gParser.MathDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathAdd}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMathAdd(gParser.MathAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathAdd}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMathAdd(gParser.MathAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathParenthesis}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMathParenthesis(gParser.MathParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathParenthesis}
	 * labeled alternative in {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMathParenthesis(gParser.MathParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolContains}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolContains(gParser.BoolContainsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolContains}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolContains(gParser.BoolContainsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolGE}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolGE(gParser.BoolGEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolGE}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolGE(gParser.BoolGEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolLess}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolLess(gParser.BoolLessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolLess}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolLess(gParser.BoolLessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolOr}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolOr(gParser.BoolOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolOr}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolOr(gParser.BoolOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolLE}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolLE(gParser.BoolLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolLE}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolLE(gParser.BoolLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolNumber}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolNumber(gParser.BoolNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolNumber}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolNumber(gParser.BoolNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(gParser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(gParser.BoolNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolEquals}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolEquals(gParser.BoolEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolEquals}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolEquals(gParser.BoolEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringEquals}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterStringEquals(gParser.StringEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringEquals}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitStringEquals(gParser.StringEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolMath}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolMath(gParser.BoolMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolMath}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolMath(gParser.BoolMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolId}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolId(gParser.BoolIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolId}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolId(gParser.BoolIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolAnd}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolAnd(gParser.BoolAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolAnd}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolAnd(gParser.BoolAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolParanthesis}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolParanthesis(gParser.BoolParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolParanthesis}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolParanthesis(gParser.BoolParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolGreater}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolGreater(gParser.BoolGreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolGreater}
	 * labeled alternative in {@link gParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolGreater(gParser.BoolGreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(gParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(gParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#methodcall}.
	 * @param ctx the parse tree
	 */
	void enterMethodcall(gParser.MethodcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#methodcall}.
	 * @param ctx the parse tree
	 */
	void exitMethodcall(gParser.MethodcallContext ctx);
}