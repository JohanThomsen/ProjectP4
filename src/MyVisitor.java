public class MyVisitor extends gBaseVisitor <Object>{

    @Override public Object visitProgram(gParser.ProgramContext ctx) { return visitChildren(ctx); }

    @Override public Object visitDeclares(gParser.DeclaresContext ctx) { return visitChildren(ctx); }

    @Override public Object visitDeclare(gParser.DeclareContext ctx) { return visitChildren(ctx); }

    @Override public Object visitCtrlstruc(gParser.CtrlstrucContext ctx) { return visitChildren(ctx); }

    @Override public Object visitCtrlstrucparam(gParser.CtrlstrucparamContext ctx) { return visitChildren(ctx); }

    @Override public Object visitClassdcls(gParser.ClassdclsContext ctx) { return visitChildren(ctx); }

    @Override public Object visitClassdcl(gParser.ClassdclContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMethoddcl(gParser.MethoddclContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBodies(gParser.BodiesContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBody(gParser.BodyContext ctx) { return visitChildren(ctx); }

    @Override public Object visitInits(gParser.InitsContext ctx) { return visitChildren(ctx); }

    @Override public Object visitInit(gParser.InitContext ctx) { return visitChildren(ctx); }

    @Override public Object visitAssigns(gParser.AssignsContext ctx) { return visitChildren(ctx); }

    @Override public Object visitAssign(gParser.AssignContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMath(gParser.MathContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMethodcall(gParser.MethodcallContext ctx) { return visitChildren(ctx); }
}
