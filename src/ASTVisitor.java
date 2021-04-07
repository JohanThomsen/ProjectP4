public abstract class ASTVisitor<T> {
    public abstract T Visit(InitializationNode node);
    public abstract T Visit(AssignNode node);
    public abstract T Visit(ClassDCLNode node);
    public abstract T Visit(MathNode node);
    public abstract T Visit(MethodCallNode node);
    public abstract T Visit(MethodDCLNode node);
    public abstract T Visit(IdNode node);
    public abstract T Visit(CtrlStrucNode node);
    /*public abstract T Visit();For Copying, so that it is easier to expand.*/

    public T Visit(AbstractNodeBase node){//Remember to expand this when a new node is made.
        if(node instanceof InitializationNode){
            return Visit((InitializationNode) node);//Remember to downcast, otherwise an overflow will happen.
        }
        else if(node instanceof AssignNode){
            return Visit((AssignNode) node);
        }
        else if(node instanceof ClassDCLNode){
            return Visit((ClassDCLNode) node);
        }
        else if(node instanceof MathNode){
            return Visit((MathNode)node);
        }
        else if(node instanceof MethodCallNode){
            return Visit((MethodCallNode) node);
        }
        else if(node instanceof MethodDCLNode){
            return Visit((MethodDCLNode) node);
        }
        else if(node instanceof IdNode){
            return Visit((IdNode) node);
        }
        else if(node instanceof CtrlStrucNode){
            return Visit((CtrlStrucNode) node);
        }
        else if(node != null){
            return Visit(node.Children.get(0));
        }

        return null;
    }
}
