// Generated from C:/Users/Christoffer/IdeaProjects/ProjectP4\g.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by {@link gParser#declares}.
	 * @param ctx the parse tree
	 */
	void enterDeclares(gParser.DeclaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declares}.
	 * @param ctx the parse tree
	 */
	void exitDeclares(gParser.DeclaresContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(gParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(gParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#ctrlstruc}.
	 * @param ctx the parse tree
	 */
	void enterCtrlstruc(gParser.CtrlstrucContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#ctrlstruc}.
	 * @param ctx the parse tree
	 */
	void exitCtrlstruc(gParser.CtrlstrucContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#ctrlstrucparam}.
	 * @param ctx the parse tree
	 */
	void enterCtrlstrucparam(gParser.CtrlstrucparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#ctrlstrucparam}.
	 * @param ctx the parse tree
	 */
	void exitCtrlstrucparam(gParser.CtrlstrucparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#classdcls}.
	 * @param ctx the parse tree
	 */
	void enterClassdcls(gParser.ClassdclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#classdcls}.
	 * @param ctx the parse tree
	 */
	void exitClassdcls(gParser.ClassdclsContext ctx);
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
	 * Enter a parse tree produced by {@link gParser#bodies}.
	 * @param ctx the parse tree
	 */
	void enterBodies(gParser.BodiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#bodies}.
	 * @param ctx the parse tree
	 */
	void exitBodies(gParser.BodiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(gParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(gParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#inits}.
	 * @param ctx the parse tree
	 */
	void enterInits(gParser.InitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#inits}.
	 * @param ctx the parse tree
	 */
	void exitInits(gParser.InitsContext ctx);
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
	 * Enter a parse tree produced by {@link gParser#assigns}.
	 * @param ctx the parse tree
	 */
	void enterAssigns(gParser.AssignsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assigns}.
	 * @param ctx the parse tree
	 */
	void exitAssigns(gParser.AssignsContext ctx);
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
	 * Enter a parse tree produced by {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(gParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(gParser.MathContext ctx);
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