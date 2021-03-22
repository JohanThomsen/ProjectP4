import org.abego.treelayout.internal.util.java.lang.string.StringUtil;

import java.util.Collections;

public class MyVisitor extends gBaseVisitor <AbstractNodeBase>{
    private int indentation = 0;

    @Override public AbstractNodeBase visitProgram(gParser.ProgramContext ctx) {
        printTabs(indentation);
        System.out.println("ProgramNode");
        indentation++;
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
        indentation--;
        return node; }

    @Override public AbstractNodeBase visitDeclares(gParser.DeclaresContext ctx) {
        printTabs(indentation);
        System.out.println("Declares");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitDeclare(gParser.DeclareContext ctx) {
        printTabs(indentation);
        System.out.println("Declare");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;
        }

    @Override public AbstractNodeBase visitCtrlstruc(gParser.CtrlstrucContext ctx) {
        printTabs(indentation);
        System.out.println("Ctrlstruc");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitCtrlstrucparam(gParser.CtrlstrucparamContext ctx) {
        printTabs(indentation);
        System.out.println("Ctrlstrucparam");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitAttributes(gParser.AttributesContext ctx) {

        printTabs(indentation);
        System.out.println("Attributes");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node; }

    @Override public AbstractNodeBase visitClassdcl(gParser.ClassdclContext ctx) {

        printTabs(indentation);
        System.out.println("Classdcl");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node; }

    @Override public AbstractNodeBase visitMethoddcl(gParser.MethoddclContext ctx) {

        printTabs(indentation);
        System.out.println("Methoddcl");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node; }

    @Override public AbstractNodeBase visitBodies(gParser.BodiesContext ctx) {

        printTabs(indentation);
        System.out.println("Bodies");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;}

    @Override public AbstractNodeBase visitBody(gParser.BodyContext ctx) {

        printTabs(indentation);
        System.out.println("Body");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;}

    @Override public AbstractNodeBase visitInit(gParser.InitContext ctx) {
        printTabs(indentation);
        System.out.println("Init");
        indentation++;
        InitializationNode node = new InitializationNode();
        if(ctx.Id(0).toString() != null){
            node.Type = new IdNode(ctx.Id(0).toString());

            if(ctx.Id(1).toString() != null){
                node.Identifier = new IdNode(ctx.Id(1).toString());
            }
        }


        indentation--;
        return  node;
        }

    @Override public AbstractNodeBase visitAssigns(gParser.AssignsContext ctx) {

        printTabs(indentation);
        System.out.println("Assigns");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;}

    @Override public AbstractNodeBase visitAssign(gParser.AssignContext ctx) {
        printTabs(indentation);
        System.out.println("Assigns");
        indentation++;
        AssignNode node = new AssignNode();
        node.Target = new IdNode(ctx.Id(0).toString());
        if(ctx.Id(1) != null){
            node.Extra = new IdNode(ctx.Id(1).toString());
        }else{
            node.attributes.add(visitChildren(ctx.attributes()));
        }
        indentation--;
        return node; }

    @Override public AbstractNodeBase visitMath(gParser.MathContext ctx) {

        printTabs(indentation);
        System.out.println("Math");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node; }

    @Override public AbstractNodeBase visitMethodcall(gParser.MethodcallContext ctx) {

        printTabs(indentation);
        System.out.println("Methodcall");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;}

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
    private void printTabs(int indentation){
        System.out.print(String.join("",Collections.nCopies(indentation,"    ")));
    }
}
