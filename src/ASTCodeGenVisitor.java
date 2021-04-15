import java.io.PrintStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Hashtable;

public class ASTCodeGenVisitor extends ASTVisitor<String>{

    private PrintStream ps;
    /*public PrintWriter exit = new PrintWriter("out.txt");*/
    int level = 0;
    private Hashtable<String, Integer> VarTable = new Hashtable<>();
    Incrementer incrementer = new Incrementer();
    private void emit(String s) {
        PrintStream ps = System.out;
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
                emit("fstore " + ((NumberNode) node.Value).value + "" + getReference("Number/" + node.Target.value));
            } else if (node.Value instanceof IdNode) {
                if (VarTable.containsKey("Number/" + ((IdNode) node.Value).value)){
                    emit("fstore " + "fload" + getReference("Number/" + ((IdNode) node.Value).value) + " " + getReference("Number/" + node.Target.value)); //TODO This is probably illegal
                } else if (VarTable.containsKey("String/" + ((IdNode) node.Value).value)){
                    emit("astore " + "aload" + getReference("String/" + ((IdNode) node.Value).value) + " " + getReference("String/" + node.Target.value)); //TODO This is probably illegal
                }
            } else if (node.Value instanceof StringNode){
                emit("astore " + ((StringNode) node.Value).value + " " + getReference("String/" + node.Target.value));
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

        emit("fcmpg");
        return null;
    }

    @Override
    public String Visit(BoolContainNode node) {
        return null;
    }

    @Override
    public String Visit(BoolEqualNode node) {

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

        emit("fcmpg");
        //exit.append("ldc");
        return null;
    }

    @Override
    public String Visit(BoolGreaterEqualNode node) {

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

        emit("fcmpg");

        return null;
    }

    @Override
    public String Visit(BoolGreaterNode node) {

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

        emit("fcmpg");

        return null;
    }

    @Override
    public String Visit(BoolLessEqualNode node) {
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

        emit("fcmpl");
        return null;
    }

    @Override
    public String Visit(BoolLessNode node) {
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

        emit("fcmpl");
        return null;
    }

    @Override
    public String Visit(BoolNotNode node) {

        emit("ldc " + ((NumberNode)node.Operand).value);
        emit("fneg");

        return null;
    }

    @Override
    public String Visit(BoolOrNode node) {
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
        if(node.LeftOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.LeftOperand).value);
        }else{
            this.Visit(node.LeftOperand);
        }
        if(node.RightOperand instanceof  NumberNode){
            emit("ldc " + ((NumberNode)node.RightOperand).value);
        }else{
            this.Visit(node.RightOperand);
        }

        emit("fadd");
        //exit.append("fadd");

        return null;
    }//TODO find difference between Add and Subtract.

    @Override
    public String Visit(MathDivNode node) {
        if(node.LeftOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.LeftOperand).value);
        }else{
            this.Visit(node.LeftOperand);
        }
        if(node.RightOperand instanceof  NumberNode){
            emit("ldc " + ((NumberNode)node.RightOperand).value);
        }else{
            this.Visit(node.RightOperand);
        }

        emit("fdiv");

        return null;
    }//Done for now

    @Override
    public String Visit(MathMultNode node) {
        if(node.LeftOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.LeftOperand).value);
        }else{
            this.Visit(node.LeftOperand);
        }
        if(node.RightOperand instanceof  NumberNode){
            emit("ldc " + ((NumberNode)node.RightOperand).value);
        }else{
            this.Visit(node.RightOperand);
        }

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
}
