public class ASTTypeCheck extends ASTVisitor<String>{
    public SymbolTable Table;

    ASTTypeCheck(SymbolTable tablet){
        this.Table = tablet;
    }

    @Override
    public String Visit(InitializationNode node) {


        return null;
    }

    @Override
    public String Visit(AssignNode node) {
        Symbol temp = Table.retrieveSymbol(node.Target.value);
        if(temp != null){
                System.out.println(temp.Name + " Is a legal assignment");
                return temp.Name;
        }else {
            System.out.println(node.Target.value + " Has not been initialized");
        }
        return null;
    }

    @Override
    public String Visit(ClassDCLNode node) {

        return null;
    }

    @Override
    public String Visit(MathNode node) {

        return null;
    }

    @Override
    public String Visit(MethodCallNode node) {
        Symbol temp = Table.retrieveSymbol(node.Left.value);
        if(temp != null && temp.Type.equals("method")){
            System.out.println(temp.Name + " Is a legal methodcall");
        }
        return null;
    }

    @Override
    public String Visit(MethodDCLNode node) {
        return null;
    }

    @Override
    public String Visit(IdNode node) {
        return null;
    }

    @Override
    public String Visit(CtrlStrucNode node) {
        return null;
    }

    public AbstractNodeBase Visit(NumberNode node){
        return null;
    }
}
