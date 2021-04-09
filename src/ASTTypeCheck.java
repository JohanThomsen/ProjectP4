public class ASTTypeCheck extends ASTVisitor<String>{
    public SymbolTable Table;

    ASTTypeCheck(SymbolTable tablet){
        this.Table = tablet;
    }

    @Override
    public String Visit(AddNode node) {
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
    public String Visit(BoolAndNode node) {
        return null;
    }

    @Override
    public String Visit(BoolContainNode node) {
        return null;
    }

    @Override
    public String Visit(BoolEqualNode node) {
        return null;
    }

    @Override
    public String Visit(BoolGreaterEqualNode node) {
        return null;
    }

    @Override
    public String Visit(BoolGreaterNode node) {
        return null;
    }

    @Override
    public String Visit(BoolLessEqualNode node) {
        return null;
    }

    @Override
    public String Visit(BoolLessNode node) {
        return null;
    }

    @Override
    public String Visit(BoolNotNode node) {
        return null;
    }

    @Override
    public String Visit(BoolOrNode node) {
        return null;
    }

    @Override
    public String Visit(BoolParenthesisNode node) {
        return null;
    }

    @Override
    public String Visit(ClassDCLNode node) {

        return null;
    }

    @Override
    public String Visit(ClassNode node) {
        return null;
    }

    @Override
    public String Visit(MathDivNode node) {
        return null;
    }

    @Override
    public String Visit(MathMultNode node) {
        return null;
    }

    @Override
    public String Visit(MathParenthesisNode node) {
        return null;
    }

    @Override
    public String Visit(MathAddNode node) {
        System.out.println("Math is here");
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
    public String Visit(MultiplicationNode node) {
        return null;
    }

    @Override
    public String Visit(IdNode node) {
        return null;
    }

    @Override
    public String Visit(IfNode node) {
        return null;
    }

    @Override
    public String Visit(InitializationNode node) {


        return null;
    }

    @Override
    public String Visit(CtrlStrucNode node) {
        return null;
    }

    @Override
    public String Visit(DivisionNode node) {
        return null;
    }

    @Override
    public String Visit(NumberNode node){
        return null;
    }

    @Override
    public String Visit(StringNode node) {
        return null;
    }

    @Override
    public String Visit(SubtractionNode node) {
        return null;
    }
}
