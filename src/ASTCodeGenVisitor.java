import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Hashtable;
import java.util.regex.*;

public class ASTCodeGenVisitor extends ASTVisitor<String>{

    private PrintStream ps;

    {
        try {
            ps = new PrintStream("out.j");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    int level = 0;
    private Hashtable<String, Integer> VarTable = new Hashtable<>();
    Incrementer incrementer = new Incrementer(4);
    Incrementer loopIncrementer = new Incrementer();
    Incrementer blockIncrementer = new Incrementer();
    Incrementer boolIncrementer = new Incrementer();
    public void emit(String s) {//TODO Change this to print to a .j file.
        System.out.println(s);
        //PrintStream ps = System.out;//System.out will probably be changed to the .j file for output
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
            } else if (node.Value instanceof IdNode) {
                if (VarTable.containsKey("Number/" + ((IdNode) node.Value).value)){
                    emit("fload " +  getReference("Number/" + ((IdNode) node.Value).value));
                    emit("fstore " + getReference("Number/" + node.Target.value));
                } else if (VarTable.containsKey("String/" + ((IdNode) node.Value).value)){
                    emit("aload " +  getReference("String/" + ((IdNode) node.Value).value));
                    emit("astore " + getReference("String/" + node.Target.value));
                }
            } else if (node.Value instanceof MethodCallNode) {
                if (((MethodCallNode) node.Value).Identifier.value.equals("read")){ //TODO do not do this, give methods return types instead
                    this.Visit((MethodCallNode) node.Value);
                    emit("astore " + getReference("String/" + node.Target.value));
                }
            } else {
                this.Visit(node.Value);
                emit("fstore " + getReference("Number/" + node.Target.value));
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
        int boolID = boolIncrementer.GetNextID();
        //First check the left operand, if false, jump till end
        if(node.LeftOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.LeftOperand).value);
        }else {
            this.Visit(node.LeftOperand);
            emit("i2f");
        }
        emit("ifeq falselabel" + boolID);
        //Then check if the second operand is true
        if(node.RightOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.RightOperand).value);
        }else {
            this.Visit(node.RightOperand);
            emit("i2f");
        }
        emit("ifeq falselabel" + boolID);//If right operand is false, jump til end

        emit("iconst_1");
        emit("goto endlabel" + boolID);

        emit("falselabel" + boolID + ":");
        emit("iconst_0");
        emit("endlabel" + boolID + ":");
        return null;
    }

    @Override
    public String Visit(BoolContainNode node) {
        return null;
    }

    @Override
    public String Visit(BoolEqualNode node) { //If greater than returns 1 if equal return 0 if less than return -1
        BoolLoadNumber(node);
        BoolNodeEmit("ifeq truelabel");
        return null;
    }

    @Override
    public String Visit(BoolGreaterEqualNode node) { //If greater than returns 1 if equal return 0 if less than return -1

        BoolLoadNumber(node);
        BoolNodeEmit("ifge truelabel");
        return null;
    }

    @Override
    public String Visit(BoolGreaterNode node) { //If greater than returns 1 if equal return 0 if less than return -1

        BoolLoadNumber(node);
        BoolNodeEmit("ifgt truelabel");
        return null;
    }

    @Override
    public String Visit(BoolLessEqualNode node) { //If greater than returns 1 if equal return 0 if less than return -1

        BoolLoadNumber(node);
        BoolNodeEmit("ifle truelabel");
        return null;
    }

    @Override
    public String Visit(BoolLessNode node) { //If greater than returns 1 if equal return 0 if less than return -1

        BoolLoadNumber(node);
        BoolNodeEmit("iflt truelabel");
        return null;
    }



    private void BoolNodeEmit(String comparer) {
        int boolID = boolIncrementer.GetNextID();

        emit("fcmpl");
        emit(comparer + boolID);
        emit("iconst_0");
        emit("goto endlabel" + boolID);
        emit("truelabel" + boolID + ":");
        emit("iconst_1");
        emit("endlabel" + boolID + ":");
    }

    @Override
    public String Visit(BoolNotNode node) {
        this.Visit(node.Operand);
        emit("i2f");
        emit("ldc 0.0");
        BoolNodeEmit("ifeq truelabel");

        return null;
    }

    @Override
    public String Visit(BoolOrNode node) {
        int boolID = boolIncrementer.GetNextID();
        //First check the left operand, if true, jump till end and push true
        if(node.LeftOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.LeftOperand).value);
        }else {
            this.Visit(node.LeftOperand);
            emit("i2f");
        }
        emit("ifne truelabel" + boolID);
        //Then check if the second operand is true
        if(node.RightOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.RightOperand).value);
        }else {
            this.Visit(node.RightOperand);
            emit("i2f");
        }
        emit("ifne truelabel" + boolID);//If right operand is true, jump til end and push true

        emit("iconst_0"); //If both are false, push false and end
        emit("goto endlabel" + boolID);

        emit("truelabel" + boolID + ":"); //If even one is true, push true
        emit("iconst_1");
        emit("endlabel" + boolID + ":");

        return null;
    }

    @Override
    public String Visit(BoolParenthesisNode node) {

        this.Visit(node.Operand);

        return null;
    }

    @Override
    public String Visit(ClassDCLNode node){//TODO make it so that this node creates a file.
        File newFile = new File(node.Identifier +".j");
        try {
            ps = new PrintStream(node.Identifier + ".j");
            emit(".class public com/company/" + node.Identifier);
            emit(".super java/lang/Object");
            genInit();
            for(int i = 0; i < node.Statements.size(); i++){
                this.Visit(node.Statements.get(i));
            }
            ps = new PrintStream("out.j");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
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
        int blockID = blockIncrementer.GetNextID();
        this.Visit(node.Predicate);
        emit("ifeq BranchEnd" + blockID);
        for (AbstractNodeBase a:  node.Statements) {
            this.Visit(a);
        }
        emit("BranchEnd" + blockID + ":");
        return null;
    }

    @Override
    public String Visit(WhileNode node) {
        int loopID = loopIncrementer.GetNextID();
        int blockID = blockIncrementer.GetNextID();
        emit("LoopStart" + loopID + ":");
        this.Visit(node.Predicate);
        emit("ifeq BranchEnd" + blockID);
        for (AbstractNodeBase a:  node.Statements) {
            this.Visit(a);
        }
        emit("goto LoopStart" + loopID);
        emit("BranchEnd" + blockID + ":");

        return null;
    }

    @Override
    public String Visit(ForNode node) {
        int loopID = loopIncrementer.GetNextID();
        int blockID = blockIncrementer.GetNextID();
        //Init
        this.Visit(node.init);
        //Assign
        this.Visit(node.assign);
        emit("LoopStart" + loopID + ":");
        //check Predicate
        this.Visit(node.Predicate);
        emit("ifeq BranchEnd" + blockID);
        for (AbstractNodeBase a:  node.Statements) {
            this.Visit(a);
        }
        //Increment
        emit("fconst_1");
        emit("fload " +  getReference("Number/" + (node.Id.value)));
        emit("fadd");
        emit("fstore " + getReference("Number/" + (node.Id.value)));
        //Loop back
        emit("goto LoopStart" + loopID);
        //Or end
        emit("BranchEnd" + blockID + ":");
        return null;
    }

    @Override
    public String Visit(StringEqualsNode node) {
        stringEquals(node);
        BoolNodeEmit("ifeq truelabel");
        return null;
    }

    @Override
    public String Visit(InitializationNode node) {
        int nextID = incrementer.GetNextID();
        if (node.Type.value.equals("number")){
            VarTable.put("Number/" + node.Identifier.value, nextID);
        } else if (node.Type.value.equals("string")){
            VarTable.put("String/" + node.Identifier.value, nextID);
        } else if (node.Type.value.equals("Class")){
            int ThisId = incrementer.GetNextID();
            emit("new com/company/"+node.Identifier.value);
            emit("dup");
            emit("invokespecial com/company/"+node.Identifier.value+".<init>()V");
            emit("aload "+ ThisId);
            VarTable.put(node.Identifier.value, ThisId);
        }
        return null;
    }

    @Override
    public String Visit(MathAddNode node) {
        LoadNumber(node);

        emit("fadd");


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
        if (node.Identifier.value.equals("print")) {
            String concatenatedParameters = "";

            for (AbstractNodeBase currentParam:node.Parameters) {
                if (currentParam instanceof StringNode){
                    concatenatedParameters += currentParam.toString();
                    printStuff(concatenatedParameters);
                } else if (currentParam instanceof IdNode){
                    VarTable.get(((IdNode) currentParam).value);
                    if (VarTable.containsKey("Number/" +  ((IdNode) currentParam).value)){
                        printStuff(getReference("Number/" + ((IdNode) currentParam).value), "F");
                    } else if (VarTable.containsKey("String/" + ((IdNode) currentParam).value)){
                        printStuff(getReference("String/" + ((IdNode) currentParam).value), "Ljava/lang/String;");
                    }
                } else if (currentParam.Children.size() > 1){
                    printNumberFromStack(currentParam);
                } else if (currentParam instanceof BinaryOperator){
                    printNumberFromStack(currentParam);
                }
            }
        } else if (node.Identifier.value.equals("read")) {
            scanCall();
        } else {

            String params = "";
            emit("aload " + VarTable.get(node.Identifier.value));
            for (int i = 0; i < node.Parameters.size(); i++) {
                IdNode currentNode = (IdNode) node.Parameters.get(i);
                if (Pattern.matches("[0-9]+", currentNode.value)) {
                    params.concat("F");
                } else if (Pattern.matches("[a-zA-Z0-9]+", currentNode.value)) {
                    params.concat("Ljava/lang/String;");
                }

            }
            emit("invokestatic " + node.Identifier.value + "(" + params + ")V");//TODO Add support for method call from classes
        }
        return null;
    }

    @Override
    public String Visit(MethodDeclerationNode node) {
        int nextID = incrementer.GetNextID();
        if (node.Parameters != null){
            for (int i=0; i<node.Parameters.size(); i++) {
                String typeValue = node.Types.get(i).value;
                String paramValue = node.Parameters.get(i).value;
                if (typeValue.equals("number")) {
                    VarTable.put("Number/" + paramValue, nextID);
                } else if (typeValue.equals("string")) {
                    VarTable.put("String/" + paramValue, nextID);
                } else {
                    VarTable.put(typeValue + "/" + paramValue, nextID);
                }
            }
        }
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
        }else if (node.RightOperand instanceof IdNode){
            emit("fload " +  getReference("Number/" + ((IdNode)node.RightOperand).value));
        }
        else{
            this.Visit(node.RightOperand);
        }
    }

    private void BoolLoadNumber(BinaryOperator node){
        if(node.LeftOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.LeftOperand).value);
        }else if(node.LeftOperand instanceof IdNode){
            emit("fload " + getReference("Number/" +((IdNode) node.LeftOperand).value));
        }else{
            this.Visit(node.LeftOperand);
            emit("i2f");
        }
        if(node.RightOperand instanceof  NumberNode){
            emit("ldc " + ((NumberNode)node.RightOperand).value);
        }else if(node.RightOperand instanceof IdNode){
            emit("fload " + getReference("Number/" +((IdNode) node.RightOperand).value));
        }else{
            this.Visit(node.RightOperand);
            emit("i2f");
        }

    }

    public void genMain(){
        emit(".class public Out");
        emit(".super java/lang/Object");
        emit(".method public <init>()V");
        emit("aload_0");
        emit("invokenonvirtual java/lang/Object/<init>()V");
        emit("return");
        emit(".end method");
        emit(".method public static main([Ljava/lang/String;)V");
    }

    public void genInit(){
        emit(".method public <init>()V");
        emit("aload_0");
        emit("invokenonvirtual java/lang/Object/<init>()V");
        emit("return");
        emit(".end method");
    }

    public void genEnd(){
        emit(".limit locals "+VarTable.size());
        emit(".limit stack 10");
        emit("return");
        emit(".end method");
    }

    public void printStuff(float f){
        if(!VarTable.containsKey("OutStream")){
            genPrintStream();
        }

        emit("aload " + VarTable.get("OutStream"));
        emit("ldc "+ f);
        emit("invokevirtual java/io/PrintStream/println(F)V");
    }

    public void genPrintStream(){
            int out = incrementer.GetNextID();
            VarTable.put("OutStream", out);
            emit("getstatic java/lang/System/out Ljava/io/PrintStream;");
            emit("astore " + out);

    }

    public void printStuff(String s){
        if(!VarTable.containsKey("OutStream")){
            genPrintStream();
        }
        emit("aload " + VarTable.get("OutStream"));
        emit("ldc \""+ s +"\"");
        emit("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
    }

    public void printNumberFromStack(AbstractNodeBase node){
        if(!VarTable.containsKey("OutStream")){
            genPrintStream();
        }
        emit("aload " + VarTable.get("OutStream"));
        this.Visit(node);
        emit("invokevirtual java/io/PrintStream/println(F)V");
    }

    public void printStringFromStack(AbstractNodeBase node){
        if(!VarTable.containsKey("OutStream")){
            genPrintStream();
        }
        emit("aload " + VarTable.get("OutStream"));
        this.Visit(node);
        emit("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
    }

    public void printStuff(int reference, String type){
        if(!VarTable.containsKey("OutStream")){
            genPrintStream();
        }
        emit("aload " + VarTable.get("OutStream"));
        if (type.equals("F")){
            emit("fload " + reference);
        } else {
            emit("aload " + reference);
        }

        emit("invokevirtual java/io/PrintStream/println(" + type + ")V");
    }

    public void genInputScanner(){
        int Id = incrementer.GetNextID();
        emit("new java/util/Scanner");
        emit("dup");
        emit("getstatic java/lang/System.in Ljava/io/InputStream;");
        emit("invokespecial java/util/Scanner.<init>(Ljava/io/InputStream;)V");
        emit("astore "+ Id);
        VarTable.put("Scanner", Id);
    }

    public void scanCall(){
        if(!VarTable.containsKey("Scanner")){
            genInputScanner();
        }
        emit("aload "+ VarTable.get("Scanner"));
        emit("invokevirtual java/util/Scanner.nextLine()Ljava/lang/String;");
    }

    private void stringEquals(StringEqualsNode node){
        if (node.LeftOperand instanceof StringNode) {
            if (node.RightOperand instanceof StringNode){
                emit("ldc \""+((StringNode) node.LeftOperand).value+"\"");
                emit("ldc \""+((StringNode) node.RightOperand).value+"\"");
            } else {
                emit("ldc \""+((StringNode) node.LeftOperand).value+"\"");
                emit("aload " +  getReference("String/" + ((IdNode)node.RightOperand).value));
            }
        } else {
            if (node.RightOperand instanceof StringNode){
                emit("aload " +  getReference("String/" + ((IdNode)node.LeftOperand).value));
                emit("ldc \""+((StringNode) node.RightOperand).value+"\"");
            } else {
                emit("aload " +  getReference("String/" + ((IdNode)node.LeftOperand).value));
                emit("aload " +  getReference("String/" + ((IdNode)node.RightOperand).value));
            }
        }
        emit("invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I");
        emit("i2f");
        emit("fconst_0");
    }
}
