import java.io.PrintStream;
import java.util.Hashtable;

public class ASTCodeGenVisitor extends ASTVisitor<String>{

    private PrintStream ps;

    int level = 0;
    private Hashtable<String, Integer> VarTable = new Hashtable<>();
    Incrementer incrementer = new Incrementer();
    public void emit(String s) {//TODO Change this to print to a .j file.
        PrintStream ps = System.out;//System.out will probably be changed to the .j file for output
        out(ps, s);
    }
    public void out(String s) {
        out(this.ps, s);
    }//ps is a PrintStream
    public void out(PrintStream ps, String s)  {
        String tab = "";
        for (int i=1; i <= level; ++i) tab += "  ";//level is an int
        ps.println(tab + s);
    }

    private int getReference(String target) {
        return VarTable.get(target);
    }


    @Override
    public String Visit(AssignNode node) {
        if (VarTable.containsKey("Number/" + node.Target.value) || VarTable.containsKey("String/" + node.Target.value)){
            if (node.Value instanceof NumberNode){
                emit("ldc " + ((NumberNode) node.Value).value);
                emit("fstore " + getReference("Number/" + node.Target.value));
            } else if (node.Value instanceof StringNode){
                emit("ldc " + ((StringNode) node.Value).value);
                emit("astore " + getReference("String/" + node.Target.value));
            } else if (node.Value instanceof BinaryOperator) {
                this.Visit(node.Value);
                emit("fstore " + getReference("Number/" + node.Target.value));
            } else if (node.Value instanceof IdNode) {
                if (VarTable.containsKey("Number/" + ((IdNode) node.Value).value)){
                    emit("fload " +  getReference("Number/" + ((IdNode) node.Value).value));//TODO use ldc to put value onto the stack to be stored
                    emit("fstore " + getReference("Number/" + node.Target.value));
                } else if (VarTable.containsKey("String/" + ((IdNode) node.Value).value)){
                    emit("aload " +  getReference("String/" + ((IdNode) node.Value).value));
                    emit("astore " + getReference("String/" + node.Target.value));
                }
            }
        }
        /* This would allow for initialization in assignment
        else {
            //Everything under here is essentially an Initialization
            int nextID = incrementer.GetNextID();
            if (node.Value instanceof NumberNode){
                VarTable.put("Number/" + node.Target.value, nextID);
                emit("fstore " + ((NumberNode) node.Value).value + nextID);
            } else if (node.Value instanceof StringNode){
                VarTable.put("String/" + node.Target.value, nextID);
                emit("astore " + ((StringNode) node.Value).value + nextID);
            }
        }*/
        return null;
    }

    @Override
    public String Visit(BoolAndNode node) {

        BoolLoadNumber(node);

        emit("fcmpg");
        return null;
    }

    @Override
    public String Visit(BoolContainNode node) {
        return null;
    }

    @Override
    public String Visit(BoolEqualNode node) { //If greater than returns 1 if equal return 0 if less than return -1

        BoolLoadNumber(node);

        emit("fcmpg");

        return null;
    }

    @Override
    public String Visit(BoolGreaterEqualNode node) { //If greater than returns 1 if equal return 0 if less than return -1

        BoolLoadNumber(node);

        emit("fcmpg");

        return null;
    }

    @Override
    public String Visit(BoolGreaterNode node) { //If greater than returns 1 if equal return 0 if less than return -1

        BoolLoadNumber(node);

        emit("fcmpg");

        return null;
    }

    @Override
    public String Visit(BoolLessEqualNode node) { //If greater than returns 1 if equal return 0 if less than return -1
        BoolLoadNumber(node);

        emit("fcmpl");
        return null;
    }

    @Override
    public String Visit(BoolLessNode node) { //If greater than returns 1 if equal return 0 if less than return -1
        BoolLoadNumber(node);

        emit("fcmpl");
        return null;
    }

    @Override
    public String Visit(BoolNotNode node) {

        emit("ldc " + ((NumberNode)node.Operand).value);
        emit("ifeq Truelabel");
        emit("iconst_0");
        emit("goto stoplabel");
        emit("Truelabel:");
        emit("iconst_1");
        emit("stoplabel:");

        return null;
    }

    @Override
    public String Visit(BoolOrNode node) {
        BoolLoadNumber(node);

        return null;
    }

    @Override
    public String Visit(BoolParenthesisNode node) {

        this.Visit(node.Operand);

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
    public String Visit(CtrlStrucNode node) {
        return null;
    }


    @Override
    public String Visit(IdNode node) {
        return null;
    }

    @Override
    public String Visit(IfNode node) {
        this.Visit(node.Predicate);
        emit("ifeq BranchEnd");
        for (AbstractNodeBase a:  node.Statements) {
            this.Visit(a);
        }
        emit("BranchEnd:");
        return null;
    }

    @Override
    public String Visit(InitializationNode node) {
        int nextID = incrementer.GetNextID();
        if (node.Type.value.equals("number")){
            VarTable.put("Number/" + node.Identifier.value, nextID);
        } else if (node.Type.value.equals("string")){
            VarTable.put("String/" + node.Identifier.value, nextID);
        }
        return null;
    }

    @Override
    public String Visit(MathAddNode node) {
        LoadNumber(node);

        emit("fadd");
        //exit.append("fadd");

        return null;
    }//TODO find difference between Add and Subtract.

    @Override
    public String Visit(MathDivNode node) {
        LoadNumber(node);

        emit("fdiv");

        return null;
    }//Done for now

    @Override
    public String Visit(MathMultNode node) {
        LoadNumber(node);

        emit("fmul");
        return null;
    }//Done for now

    @Override
    public String Visit(MathParenthesisNode node) {

        this.Visit(node.Operand);

        return null;
    }//Done for now

    @Override
    public String Visit(MethodCallNode node) {
        return null;
    }

    @Override
    public String Visit(MethodDCLNode node) {
        return null;
    }

    @Override
    public String Visit(NumberNode node) {
        return null;
    }//Not important for now

    @Override
    public String Visit(StringNode node) {
        return null;
    }//Not important for now

    @Override
    public String Visit(SubtractionNode node) {
        return null;
    }//Not important for now

    private void LoadNumber(BinaryOperator node) {
        if(node.LeftOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.LeftOperand).value);
        } else if (node.LeftOperand instanceof IdNode){
            emit("fload " +  getReference("Number/" + ((IdNode)node.LeftOperand).value));
        }
        else{
            this.Visit(node.LeftOperand);
        }

        if(node.RightOperand instanceof  NumberNode){
            emit("ldc " + ((NumberNode)node.RightOperand).value);
        }else if (node.LeftOperand instanceof IdNode){
            emit("fload " +  getReference("Number/" + ((IdNode)node.RightOperand).value));
        }
        else{
            this.Visit(node.RightOperand);
        }
    }

    private void BoolLoadNumber(BinaryOperator node){
        if(node.LeftOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.LeftOperand).value);
        }else{
            this.Visit(node.LeftOperand);
            emit("i2f");
        }
        if(node.RightOperand instanceof  NumberNode){
            emit("ldc " + ((NumberNode)node.RightOperand).value);
        }else{
            this.Visit(node.RightOperand);
            emit("i2f");
        }
    }
}
