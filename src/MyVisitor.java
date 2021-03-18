public class MyVisitor extends gBaseVisitor <AbstractNodeBase>{


    @Override public AbstractNodeBase visitProgram(gParser.ProgramContext ctx) {

        System.out.println("Visited Prog");
        AbstractNodeBase node = new AbstractNodeBase();

        node.Children.add(visitChildren(ctx.declares()));

        System.out.println("Visited Prog end");
        return node; }

    @Override public AbstractNodeBase visitDeclares(gParser.DeclaresContext ctx) {

        System.out.println("Visited Declares");


        return visitChildren(ctx.declare());
    }

    @Override public AbstractNodeBase visitDeclare(gParser.DeclareContext ctx) {

        System.out.println("Visited Declare");

        if(ctx.getChild(0) instanceof gParser.InitContext){
            return visitChildren(ctx.init());
        }else if (ctx.getChild(0) instanceof gParser.AssignsContext){
            return visit(ctx.assigns());
        }else if (ctx.getChild(0) instanceof  gParser.ClassdclContext){
            return visit(ctx.classdcl());
        }else if (ctx.getChild(0) instanceof  gParser.MethoddclContext){
            return visit(ctx.methoddcl());
        }

        return null;
        }

    @Override public AbstractNodeBase visitCtrlstruc(gParser.CtrlstrucContext ctx) {

        //System.out.println("Visited Control Structure");

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitCtrlstrucparam(gParser.CtrlstrucparamContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitAttributes(gParser.AttributesContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitClassdcl(gParser.ClassdclContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitMethoddcl(gParser.MethoddclContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitBodies(gParser.BodiesContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitBody(gParser.BodyContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitInit(gParser.InitContext ctx) {

        System.out.println("Visited Init");
        InitializationNode node = new InitializationNode();
        if(ctx.Id(0).toString() != null){
            node.Type = new IdNode(ctx.Id(0).toString());

            if(ctx.Id(1).toString() != null){
                node.Identifier = new IdNode(ctx.Id(1).toString());
            }
        }

        return  node;
        }

    @Override public AbstractNodeBase visitAssigns(gParser.AssignsContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitAssign(gParser.AssignContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitMath(gParser.MathContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitMethodcall(gParser.MethodcallContext ctx) {

        return visitChildren(ctx); }


}
