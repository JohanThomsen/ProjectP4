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

        node = AbstractRemoval(node);

        indentation--;
        return node; }

    @Override public AbstractNodeBase visitExpressions(gParser.ExpressionsContext ctx) {
        printTabs(indentation);
        System.out.println("Expressions");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitExpression(gParser.ExpressionContext ctx) {
        printTabs(indentation);
        System.out.println("Expression");
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

    @Override public AbstractNodeBase visitCtrlif(gParser.CtrlifContext ctx) {

        printTabs(indentation);
        System.out.println("CtrlIf");
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

    @Override public AbstractNodeBase visitClassdcl(gParser.ClassdclContext ctx) {

        printTabs(indentation);
        System.out.println("Classdcl");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitInit(gParser.InitContext ctx) {
        printTabs(indentation);
        System.out.println("Init");
        indentation++;
        InitializationNode node = new InitializationNode();
        if(ctx.Id(0) != null){
            node.Type = new IdNode(ctx.Id(0).toString());

            if(ctx.Id(1) != null){
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
        return node;
    }

    @Override public AbstractNodeBase visitAssign(gParser.AssignContext ctx) {
        printTabs(indentation);
        System.out.println("Assign");
        indentation++;
        AssignNode node = new AssignNode();
        node.Target = new IdNode(ctx.Id().toString());
        if(ctx.Id() != null){
            node.Extra = new IdNode(ctx.Id().toString());
        }else{
            node.attributes.add(visitChildren(ctx.attributes()));
        }
        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitAttributes(gParser.AttributesContext ctx) {

        printTabs(indentation);
        System.out.println("Attributes");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitNumber(gParser.NumberContext ctx) {
        printTabs(indentation);
        System.out.println("Number");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;}

    @Override public AbstractNodeBase visitMathMult(gParser.MathMultContext ctx) {
        printTabs(indentation);
        System.out.println("MathMult");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;}

    @Override public AbstractNodeBase visitMathDiv(gParser.MathDivContext ctx) {
        printTabs(indentation);
        System.out.println("MathDiv");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitMathAdd(gParser.MathAddContext ctx) {
        printTabs(indentation);
        System.out.println("MathAdd");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitMathParenthesis(gParser.MathParenthesisContext ctx) {
        printTabs(indentation);
        System.out.println("MathParenthesis");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitId(gParser.IdContext ctx) {
        printTabs(indentation);
        System.out.println("Id");
        indentation++;

        AbstractNodeBase node = visitChildren(ctx);
        indentation--;
        return node;
    }

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

    private void printTabs(int indentation){
        System.out.print(String.join("",Collections.nCopies(indentation,"    ")));
    }
}
