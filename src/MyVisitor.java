public class MyVisitor extends gBaseVisitor <AbstractNodeBase>{


    @Override public AbstractNodeBase visitProgram(gParser.ProgramContext ctx) {

        System.out.println("Visited Prog");
        AbstractNodeBase node;

        node = visitChildren(ctx);
        node = reduce(node);
        while(node.Children.get(node.Children.size()-1).getClass() == node.getClass()){
            node.Children.addAll(node.Children.get(node.Children.size()-1).Children);
        }

        for(int i = 0; i < node.Children.size(); i++)
            if(node.Children.get(i).getClass() == node.getClass()){
                node.Children.remove(i);
            }


        System.out.println("Visited Prog end");
        return node; }

    @Override public AbstractNodeBase visitDeclares(gParser.DeclaresContext ctx) {

        System.out.println("Visited Declares");


        return visitChildren(ctx);
    }

    @Override public AbstractNodeBase visitDeclare(gParser.DeclareContext ctx) {

        System.out.println("Visited Declare");

        return visitChildren(ctx);
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
        AssignNode node = new AssignNode();
        node.Target = new IdNode(ctx.Id(0).toString());
        if(ctx.Id(1) != null){
            node.Extra = new IdNode(ctx.Id(1).toString());
        }else{
            node.attributes.add(visitChildren(ctx.attributes()));
        }

        return node; }

    @Override public AbstractNodeBase visitMath(gParser.MathContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitMethodcall(gParser.MethodcallContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase aggregateResult(AbstractNodeBase aggregate, AbstractNodeBase nextResult) {

        if(nextResult != null){
            nextResult = reduce(nextResult);

            if(aggregate != null){

                aggregate.Children.add(nextResult);

            }else if(aggregate == null){

                aggregate = new AbstractNodeBase();
                aggregate.Children.add(nextResult);
                /*aggregate = nextResult;*/
            }
        }

        return aggregate;
    }

    private AbstractNodeBase reduce(AbstractNodeBase root){
        if(root != null){
            while(root.Children.size() == 1){
                root = root.Children.get(0);
            }
        }
        return root;
    }
}
