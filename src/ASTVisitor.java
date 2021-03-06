public abstract class ASTVisitor<T> {
    public abstract T Visit(AssignNode node);
    public abstract T Visit(BoolAndNode node);
    public abstract T Visit(BoolContainNode node);
    public abstract T Visit(BoolEqualNode node);
    public abstract T Visit(BoolGreaterEqualNode node);
    public abstract T Visit(BoolGreaterNode node);
    public abstract T Visit(BoolLessEqualNode node);
    public abstract T Visit(BoolLessNode node);
    public abstract T Visit(BoolNotNode node);
    public abstract T Visit(BoolOrNode node);
    public abstract T Visit(BoolParenthesisNode node);
    public abstract T Visit(ClassDCLNode node);
    public abstract T Visit(ClassNode node);
    public abstract T Visit(CtrlStrucNode node);
    public abstract T Visit(IdNode node);
    public abstract T Visit(IfNode node);
    public abstract T Visit(InitializationNode node);
    public abstract T Visit(MathAddNode node);
    public abstract T Visit(MathDivNode node);
    public abstract T Visit(MathMultNode node);
    public abstract T Visit(MathParenthesisNode node);
    public abstract T Visit(MethodCallNode node);
    public abstract T Visit(MethodDeclerationNode node);
    public abstract T Visit(NumberNode node);
    public abstract T Visit(StringNode node);
    public abstract T Visit(SubtractionNode node);
    public abstract T Visit(WhileNode node);
    public abstract T Visit(ForNode node);
    public abstract T Visit(StringEqualsNode node);
    public abstract T Visit(BreakNode node);

    public T Visit(AbstractNodeBase node){

        if(node instanceof AssignNode){return Visit((AssignNode) node);}
        else if(node instanceof BoolAndNode){return Visit((BoolAndNode) node);}
        else if(node instanceof BoolContainNode){return Visit((BoolContainNode) node);}
        else if(node instanceof BoolEqualNode){return Visit((BoolEqualNode) node);}
        else if(node instanceof BoolGreaterEqualNode){return Visit((BoolGreaterEqualNode) node);}
        else if(node instanceof BoolGreaterNode){return Visit((BoolGreaterNode) node);}
        else if(node instanceof BoolLessEqualNode){return Visit((BoolLessEqualNode) node);}
        else if(node instanceof BoolLessNode){return Visit((BoolLessNode) node);}
        else if(node instanceof BoolNotNode){return Visit((BoolNotNode) node);}
        else if(node instanceof BoolOrNode){return Visit((BoolOrNode) node);}
        else if(node instanceof BoolParenthesisNode){return Visit((BoolParenthesisNode) node);}
        else if(node instanceof ClassDCLNode){return Visit((ClassDCLNode) node);}
        else if(node instanceof ClassNode){return Visit((ClassNode) node);}
        else if(node instanceof CtrlStrucNode){return Visit((CtrlStrucNode) node);}
        else if(node instanceof IdNode){return Visit((IdNode) node);}
        else if(node instanceof IfNode){return Visit((IfNode) node);}
        else if(node instanceof InitializationNode){return Visit((InitializationNode) node);}
        else if(node instanceof MathAddNode){return Visit((MathAddNode) node);}
        else if(node instanceof MathDivNode){return Visit((MathDivNode) node);}
        else if(node instanceof MathMultNode){return Visit((MathMultNode) node);}
        else if(node instanceof MathParenthesisNode){return Visit((MathParenthesisNode) node);}
        else if(node instanceof MethodCallNode){return Visit((MethodCallNode) node);}
        else if(node instanceof MethodDeclerationNode){return Visit((MethodDeclerationNode) node);}
        else if(node instanceof NumberNode){return Visit((NumberNode) node);}
        else if(node instanceof StringNode){return Visit((StringNode)node);}
        else if(node instanceof SubtractionNode){return Visit((SubtractionNode) node);}
        else if(node instanceof WhileNode){return Visit((WhileNode) node);}
        else if(node instanceof ForNode){return Visit((ForNode) node);}
        else if(node instanceof StringEqualsNode){return Visit((StringEqualsNode) node);}
        else if(node instanceof BreakNode){return Visit((BreakNode) node);}
        else if(node != null){
            return Visit(node.Children.get(0));
        }

        return null;
    }
}
