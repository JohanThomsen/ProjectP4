public class ASTTypeCheck extends ASTVisitor<AbstractNodeBase>{
    public SymbolTable Table = new SymbolTable();

    @Override
    public AbstractNodeBase Visit(InitializationNode node) {



        return node;
    }

    @Override
    public AbstractNodeBase Visit(AssignNode node) {

        return node;
    }

    @Override
    public AbstractNodeBase Visit(ClassDCLNode node) {
        System.out.println("CD visited");
        return node;
    }

    @Override
    public AbstractNodeBase Visit(MathNode node) {
        System.out.println("Mat visited");
        return node;
    }

    @Override
    public AbstractNodeBase Visit(MethodCallNode node) {
        System.out.println("MC visited");
        return node;
    }

    @Override
    public AbstractNodeBase Visit(MethodDCLNode node) {
        return null;
    }

    @Override
    public AbstractNodeBase Visit(IdNode node) {
        return null;
    }

    @Override
    public AbstractNodeBase Visit(CtrlStrucNode node) {
        return null;
    }
}
