public class MyVisitor extends gBaseVisitor <AbstractNodeBase>{


    @Override public AbstractNodeBase visitProgram(gParser.ProgramContext ctx) {

        AbstractNodeBase node;

        node = visitChildren(ctx);

        node = reduce(node);

        node = AbstractRemoval(node);

        return node; }

    @Override public AbstractNodeBase visitDeclares(gParser.DeclaresContext ctx) {


        return visitChildren(ctx);
    }

    @Override public AbstractNodeBase visitDeclare(gParser.DeclareContext ctx) {


        return visitChildren(ctx);
        }

    @Override public AbstractNodeBase visitCtrlstruc(gParser.CtrlstrucContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitCtrlstrucparam(gParser.CtrlstrucparamContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitAttributes(gParser.AttributesContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitClassdcl(gParser.ClassdclContext ctx) {

        ClassDCLNode node = new ClassDCLNode();
        node.ID = new IdNode(ctx.Id().toString());
        AbstractNodeBase temp = visitChildren(ctx);
        node.Fields = temp.Children.get(0);

        return node; }

    @Override public AbstractNodeBase visitMethoddcl(gParser.MethoddclContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitBodies(gParser.BodiesContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitBody(gParser.BodyContext ctx) {

        return visitChildren(ctx); }

    @Override public AbstractNodeBase visitInit(gParser.InitContext ctx) {

        InitializationNode node = new InitializationNode();
        if(ctx.Id(0) != null){
            node.Type = new IdNode(ctx.Id(0).getText());

            if(ctx.Id(1) != null){
                node.Identifier = new IdNode(ctx.Id(1).getText());
            }
        }
        else{
            node.Children.add(visitChildren(ctx));
            node.Children.add(reduce(node.Children.get(0)));
            node.Children.remove(0);
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
        MethodCallNode node = new MethodCallNode(new IdNode(ctx.Id(0).getText()), new IdNode(ctx.Id(1).getText()));



        return node; }

    @Override public AbstractNodeBase aggregateResult(AbstractNodeBase aggregate, AbstractNodeBase nextResult) {

        if(nextResult != null){
            nextResult = reduce(nextResult);

            if(aggregate != null){

                aggregate.Children.add(nextResult);

            }else if(aggregate == null){

                aggregate = new AbstractNodeBase();
                aggregate.Children.add(nextResult);

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

    private AbstractNodeBase AbstractRemoval(AbstractNodeBase root){
        while(root.Children.get(root.Children.size()-1).getClass() == root.getClass()){
            root.Children.addAll(root.Children.get(root.Children.size()-1).Children);
        }

        for(int i = 0; i < root.Children.size(); i++)
            if(root.Children.get(i).getClass() == root.getClass()){
                root.Children.remove(i);
            }

        return root;
    }
}
