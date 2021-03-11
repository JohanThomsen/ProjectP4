// Generated from C:/Users/Christoffer/IdeaProjects/ProjectP4\g.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link gParser#declares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclares(gParser.DeclaresContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(gParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#ctrlstruc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrlstruc(gParser.CtrlstrucContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#ctrlstrucparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrlstrucparam(gParser.CtrlstrucparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#classdcls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdcls(gParser.ClassdclsContext ctx);
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
	 * Visit a parse tree produced by {@link gParser#bodies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodies(gParser.BodiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(gParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#inits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInits(gParser.InitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(gParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assigns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigns(gParser.AssignsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(gParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(gParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#methodcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodcall(gParser.MethodcallContext ctx);
}