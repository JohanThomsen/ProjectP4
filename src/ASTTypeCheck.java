import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class ASTTypeCheck extends ASTVisitor<String>{
    public SymbolTable Table;
    public ArrayList<String> Errors;

    ASTTypeCheck(SymbolTable tablet, ArrayList<String> errors){
        this.Table = tablet;
        Errors = errors;
    }


    @Override
    public String Visit(AssignNode node) {
        Symbol temp = Table.retrieveSymbol(node.Target.value);
        String valueType = this.Visit(node.Value);
        if(temp != null){//Checks if the target exists in the symbol table, if it does not the it has nowhere to assign to and is illegal.
            if(temp.Type.equals(valueType)){
                return temp.Type;
            }
            else{
                if (!(valueType.equals("error"))) {
                    Errors.add("Assignment error: " + node.Target.value + " and " + valueType + " do not match");
                } else {
                    Errors.add("Assignment failed due to error elsewhere"); //TODO Do we want this ?
                }
            }
        } else {
            Errors.add(node.Target.value + " Has not been initialized");
        }
        return "error";
    }

    @Override
    public String Visit(BoolAndNode node) {
        return BoolCheck(node);
    }

    @Override
    public String Visit(BoolContainNode node) {
        return null;
    }

    @Override
    public String Visit(BoolEqualNode node) {
        return BoolCheck(node);
    }

    @Override
    public String Visit(BoolGreaterEqualNode node) {
        return BoolCheck(node);
    }

    @Override
    public String Visit(BoolGreaterNode node) {
        return BoolCheck(node);
    }

    @Override
    public String Visit(BoolLessEqualNode node) {
        return BoolCheck(node);
    }

    @Override
    public String Visit(BoolLessNode node) {
        return BoolCheck(node);
    }

    @Override
    public String Visit(BoolNotNode node) {

        return this.Visit(node.Operand);//TODO make sure this is ok
    }

    @Override
    public String Visit(BoolOrNode node) {

        return BoolCheck(node);
    }

    private String BoolCheck(BinaryOperator node) {
        String temp = this.Visit(node.LeftOperand);
        String tempRight = this.Visit(node.RightOperand);

        if(temp.equals(tempRight)){
            return "bool";
        }

        Errors.add("Bool Type Error: Left bool type: " + temp + ". Right bool type: " + tempRight);
        return "error";
    }

    @Override
    public String Visit(BoolParenthesisNode node) {
        return this.Visit(node.Operand);
    }

    @Override
    public String Visit(ClassDCLNode node) {
        Symbol temp = Table.retrieveSymbol(node.Identifier.value);
        if(temp == null){
            return "fine";
        }

        Errors.add("Duplicate definition of class : " + node.Identifier.value);
        return "duplicate";
    }

    @Override
    public String Visit(ClassNode node) {
        return null;
    }

    @Override
    public String Visit(MathDivNode node) {
        String temp = MathCheck(node);
        if (temp != null) return temp;
        return "error";
    }

    @Override
    public String Visit(MathMultNode node) {
        String temp = MathCheck(node);
        if (temp != null) return temp;
        return "error";
    }

    @Override
    public String Visit(MathParenthesisNode node) {

        return this.Visit(node.Operand);
    }

    @Override
    public String Visit(MathAddNode node) {
        String temp = MathCheck(node);
        if (temp != null) return temp;
        return "error";
    }

    private String MathCheck(BinaryOperator node) {
        String temp = this.Visit(node.LeftOperand);
        String tempRight = this.Visit(node.RightOperand);
        if(temp.equals(tempRight)) {//Both operands are checked to see if they return float. If they do not then it is an illegal expression.
            if (temp.equals("number")) {
                return temp;
            }
        }
        Errors.add("Math error: both operands have to be numbers. Left Operand type: " + temp + " Right operand type: " + tempRight);
        return null;
    }
    @Override
    public String Visit(MethodCallNode node) {
        Symbol temp = Table.retrieveSymbol(node.Identifier.value);
        if(temp != null && temp.Type.equals("method")){
            System.out.println(temp.Name + " Is a legal methodcall");
        } else if (temp != null){
            Errors.add(temp.Name + "Is not a legal method call");
        }
        return null;
    }

    @Override
    public String Visit(MethodDeclerationNode node) {
        return null;
    }


    @Override
    public String Visit(IdNode node) {
        Symbol temp = Table.retrieveSymbol(node.value);

        return temp.Type;//Returns the type to checks in expressions
    }

    @Override
    public String Visit(IfNode node) {
        this.Visit(node.Predicate);
        return "success";
    }

    @Override
    public String Visit(WhileNode node) {
        this.Visit(node.Predicate);
        return "success";
    }

    @Override
    public String Visit(ForNode node) {
        this.Visit(node.assign);
        this.Visit(node.Id);
        if (!(node.From.Children.get(0) instanceof NumberNode && node.To.Children.get(0) instanceof NumberNode)){
            Errors.add("Range parameters must be numbers");
            return "error";
        }
        return "success";
    }

    @Override
    public String Visit(InitializationNode node) {
        if(Table.retrieveSymbol(node.Type.value) != null){//Checks the symboltable, if the id has been declared
            return "exists";
        }
        Errors.add(node.Type.value + " type has not been declared yet");
        return null;
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
