public class ASTTypeCheck extends ASTVisitor<String>{
    public SymbolTable Table;

    ASTTypeCheck(SymbolTable tablet){
        this.Table = tablet;
    }


    @Override
    public String Visit(AssignNode node) {
        Symbol temp = Table.retrieveSymbol(node.Target.value);
        if(temp != null){//Checks if the target exists in the symbol table, if it does not the it has nowhere to assign to and is illegal.
            if(temp.Type.equals(this.Visit(node.Value))){
                return temp.Type;
            }
            else{
                System.out.println(this.Visit(node.Value));
                System.out.println(node.Target.value + " does not match " + temp.Type);
            }
        }else {
            System.out.println(node.Target.value + " Has not been initialized");
            Table.printCurrentScope();
        }
        return "error";
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
        System.out.println("Math is here");
        String temp = this.Visit(node.LeftOperand);
        if(temp.equals(this.Visit(node.RightOperand)))//Both operands are checked to see if they return float. If they do not then it is an illegal expression.
            if(temp.equals("number")){
                return temp;
            }
        return "error";
    }

    @Override
    public String Visit(MathMultNode node) {
        System.out.println("Math is here");
        String temp = this.Visit(node.LeftOperand);
        if(temp.equals(this.Visit(node.RightOperand)))//Both operands are checked to see if they return float. If they do not then it is an illegal expression.
            if(temp.equals("number")){
                return temp;
            }
        return "error";
    }

    @Override
    public String Visit(MathParenthesisNode node) {
        System.out.println("Math is here");

        return this.Visit(node.Operand);
    }

    @Override
    public String Visit(MathAddNode node) {
        System.out.println("Math is here");
        String temp = this.Visit(node.LeftOperand);
        if(temp.equals(this.Visit(node.RightOperand)))//Both operands are checked to see if they return float. If they do not then it is an illegal expression.
            if(temp.equals("number")){
                return temp;
            }
        return "error";
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
        Symbol temp = Table.retrieveSymbol(node.value);

        return temp.Type;//Returns the type to checks in expressions
    }

    @Override
    public String Visit(IfNode node) {
        return null;
    }

    @Override
    public String Visit(InitializationNode node) {
        if(Table.retrieveSymbol(node.Type.value) != null){//Checks the symboltable, if the id has been declared
            return "exists";
        }

        return "hej";
    }

    @Override
    public String Visit(CtrlStrucNode node) {
        return null;
    }


    @Override
    public String Visit(NumberNode node){
        return "number";
    }//Returns a the string float to check against other strings

    @Override
    public String Visit(StringNode node) {
        return "string";
    }

    @Override
    public String Visit(SubtractionNode node) {
        return null;
    }
}
