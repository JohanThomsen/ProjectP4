import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
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


    @Override public AbstractNodeBase visitCtrlif(gParser.CtrlifContext ctx) {

        printTabs(indentation);
        System.out.println("CtrlIf");
        indentation++;


        AbstractNodeBase nodeBase = visitChildren(ctx);

        IfNode node = new IfNode(nodeBase.Children.get(0), AbstractRemoval(nodeBase.Children.get(1)).Children);

        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitClassdcl(gParser.ClassdclContext ctx) {

        printTabs(indentation);
        System.out.println("Classdcl");
        indentation++;
        ClassDCLNode Class = new ClassDCLNode();
        Class.Identifier = new IdNode(ctx.Id().toString());
        Class.Statements =  AbstractRemoval(visitChildren(ctx.statements())).Children;
        indentation--;
        return Class;
    }

    @Override public AbstractNodeBase visitInit(gParser.InitContext ctx) {
        printTabs(indentation);
        System.out.println("Init");
        indentation++;
        InitializationNode node = new InitializationNode();
        if(ctx.Id(2) != null){
            node.Identifier = new IdNode(ctx.Id(0).toString());
            node.Type = new IdNode(ctx.Id(1).toString());
        } else {
            if(ctx.Id(0) != null){
                node.Type = new IdNode(ctx.Id(0).toString());

                if(ctx.Id(1) != null){
                    node.Identifier = new IdNode(ctx.Id(1).toString());
                }
            }
        }


        indentation--;
        return  node;
    }

    @Override public AbstractNodeBase visitAssign(gParser.AssignContext ctx) {
        printTabs(indentation);
        System.out.println("Assign");
        indentation++;
        AssignNode node = new AssignNode();
        node.Target = new IdNode(ctx.Id(0).toString());
        if (ctx.expression() != null ){
            node.Value = visitChildren(ctx).Children.get(1);
        }
        else if(ctx.Id(1) != null || ctx.Number() != null || ctx.String() != null){
            node.Value = visitChildren(ctx).Children.get(1);
        }else{
            node.attributes = AbstractRemoval(visitChildren(ctx.attributes()));
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

    @Override public AbstractNodeBase visitMathMult(gParser.MathMultContext ctx) {
        printTabs(indentation);
        System.out.println("MathMult");
        indentation++;

        MathMultNode node = new MathMultNode(visitChildren(ctx).Children);
        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitMathDiv(gParser.MathDivContext ctx) {
        printTabs(indentation);
        System.out.println("MathDiv");
        indentation++;

        MathDivNode node = new MathDivNode(visitChildren(ctx).Children);
        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitMathAdd(gParser.MathAddContext ctx) {
        printTabs(indentation);
        System.out.println("MathAdd");
        indentation++;

        MathAddNode node = new MathAddNode(visitChildren(ctx).Children);
        indentation--;
        return node;
    }

    @Override public AbstractNodeBase visitMathParenthesis(gParser.MathParenthesisContext ctx) {
        printTabs(indentation);
        System.out.println("MathParenthesis");
        indentation++;

        MathParenthesisNode node = new MathParenthesisNode(visitChildren(ctx).Children.get(0));
        indentation--;
        return node;
    }

    @Override
    public AbstractNodeBase visitBoolParanthesis(gParser.BoolParanthesisContext ctx) {
        return new BoolParenthesisNode(visitChildren(ctx).Children.get(0));
    }

    @Override
    public AbstractNodeBase visitBoolEquals(gParser.BoolEqualsContext ctx) {
        return new BoolEqualNode(visitChildren(ctx).Children);
    }

    @Override
    public AbstractNodeBase visitStringEquals(gParser.StringEqualsContext ctx) {
        return new StringEqualsNode(visitChildren(ctx).Children);
    }

    @Override
    public AbstractNodeBase visitBoolLess(gParser.BoolLessContext ctx) {
        return new BoolLessNode(visitChildren(ctx).Children);
    }

    @Override
    public AbstractNodeBase visitBoolGreater(gParser.BoolGreaterContext ctx) {
        return new BoolGreaterNode(visitChildren(ctx).Children);
    }

    @Override
    public AbstractNodeBase visitBoolLE(gParser.BoolLEContext ctx) {
        return new BoolLessEqualNode(visitChildren(ctx).Children);
    }

    @Override
    public AbstractNodeBase visitBoolGE(gParser.BoolGEContext ctx) {
        return new BoolGreaterEqualNode(visitChildren(ctx).Children);
    }

    @Override
    public AbstractNodeBase visitBoolOr(gParser.BoolOrContext ctx) {
        return new BoolOrNode(visitChildren(ctx).Children);
    }

    @Override
    public AbstractNodeBase visitBoolAnd(gParser.BoolAndContext ctx) {
        return new BoolAndNode(visitChildren(ctx).Children);
    }

    @Override
    public AbstractNodeBase visitBoolContains(gParser.BoolContainsContext ctx) {
        return new BoolContainNode(visitChildren(ctx).Children);
    }

    @Override
    public AbstractNodeBase visitBoolNot(gParser.BoolNotContext ctx) {
        return new BoolNotNode(visitChildren(ctx).Children.get(0));
    }

    @Override
    public AbstractNodeBase visitStatements(gParser.StatementsContext ctx) {
        AbstractNodeBase node = visitChildren(ctx);
        return node;
    }

    @Override
    public AbstractNodeBase visitStatement(gParser.StatementContext ctx) {
        AbstractNodeBase node = visitChildren(ctx);
        return node;
    }

    @Override
    public AbstractNodeBase visitCtrlwhile(gParser.CtrlwhileContext ctx) {
        printTabs(indentation);
        System.out.println("While Loop");
        indentation++;
        WhileNode node = new WhileNode(reduce(visitChildren(ctx.expression())), AbstractRemoval(visitChildren(ctx.statements())).Children);
        indentation--;
        return node;
    }

    @Override
    public AbstractNodeBase visitCtrlfor(gParser.CtrlforContext ctx) {
        printTabs(indentation);
        System.out.println("For Loop");
        indentation++;
        ForNode node = new ForNode((new IdNode(ctx.Id().toString())), visitChildren(ctx.math(0)), visitChildren(ctx.math(1)), AbstractRemoval(visitChildren(ctx.statements())).Children);
        AbstractRemoval(node.From);
        indentation--;
        return node;
    }

    @Override
    public AbstractNodeBase visitMethoddcl(gParser.MethoddclContext ctx) {
        MethodDeclerationNode node;
        switch (ctx.Id().size()) {
            case 1:
                node = new MethodDeclerationNode(new IdNode(ctx.Id(0).toString()), AbstractRemoval(visitChildren(ctx.statements())).Children);
                break;
            default:
               // String tempType = "";
                int paramCount = ctx.Id().size()-1;
                ArrayList<IdNode> parameters = new ArrayList<>();
                ArrayList<IdNode> types = new ArrayList<>();
                for (int i = 1; i <= paramCount; i = i+1){
                    if (!(i % 2 == 0)) {
                        types.add(new IdNode(ctx.Id(i).toString()));
                        //tempType = ctx.Id(i).toString().equals("number") ? "Number/" : "String/";
                    } else {
                        //parameters.add(new IdNode(tempType + ctx.Id(i).toString()));
                        parameters.add(new IdNode(ctx.Id(i).toString()));
                    }
                }
                node = new MethodDeclerationNode(new IdNode(ctx.Id(0).toString()), parameters, types, AbstractRemoval(visitChildren(ctx.statements())).Children);
                break;
        }
        return node;
    }

    @Override
    public AbstractNodeBase visitMethodcall(gParser.MethodcallContext ctx) {
        MethodCallNode node;
        int nonNullChildNodes = ctx.Id().size() + ctx.String().size() + ctx.math().size();
        switch (nonNullChildNodes) {
            case 1: //If there are no parameters
                node = new MethodCallNode(new IdNode(ctx.Id(0).toString()));
                break;
            default: //In case of parameters
                int paramCount = nonNullChildNodes-1;
                ArrayList<AbstractNodeBase> parameters = new ArrayList<>();
                for (int i = 1; i <= paramCount; i++){
                    if (ctx.Id(i) != null) { //This isnt great
                        parameters.add(new IdNode(ctx.Id(i).toString()));
                    } else if (ctx.String(i-1) != null) {
                        parameters.add(new StringNode(ctx.String(i-1).toString()));
                    } else if (ctx.math(i-1) != null) {
                        parameters.add(this.visit(ctx.math(i-1)));
                    }
                }
                node = new MethodCallNode(new IdNode(ctx.Id(0).toString()), parameters);
                break;
        }
        return node;
    }

    @Override
    public AbstractNodeBase visitTerminal(TerminalNode node) {
        switch (node.getSymbol().getType()) {
            case gParser.String:
                return new StringNode(node.toString().replace("\"", ""));
            case gParser.Id:
                return new IdNode(node.toString());
            case gParser.Number:
                return new NumberNode(Float.parseFloat(node.toString()));
            case gParser.Break:
                return new BreakNode(GetParent(node.getParent()));
            default:
                return super.visitTerminal(node);
        }
    }

    private String GetParent(ParseTree ctx){
        if (ctx instanceof gParser.CtrlforContext){
            return "ForNode";
        } else if (ctx instanceof gParser.CtrlwhileContext){
            return "WhileNode";
        } else if (ctx instanceof gParser.ProgramContext) {
            return "";
        }
        return GetParent(ctx.getParent());
    }

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
        if (root.Children.isEmpty()) {
            root.Children.add(root);
        } else {
            while(root.Children.size()-1 >= 0 && root.Children.get(root.Children.size()-1).getClass() == root.getClass()){
                root.Children.addAll(root.Children.get(root.Children.size()-1).Children);
            }

            for(int i = 0; i < root.Children.size(); i++) {
                if (root.Children.get(i).getClass() == root.getClass()) {
                    root.Children.remove(i);
                }
            }
        }



        return root;
    }

    private void printTabs(int indentation){
        System.out.print(String.join("",Collections.nCopies(indentation,"    ")));
    }
}
