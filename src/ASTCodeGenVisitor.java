//import jas.Var;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
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
    final int reservedSpace = 4;
    private Hashtable<String, Integer> VarTable = new Hashtable<>();
    Incrementer incrementer = new Incrementer(reservedSpace);
    Incrementer loopIncrementer = new Incrementer();
    Incrementer blockIncrementer = new Incrementer();
    Incrementer boolIncrementer = new Incrementer();
    Incrementer printIncrementer = new Incrementer();
    public ArrayList<MethodDeclerationNode> methods = new ArrayList<>();
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
                emit("ldc \"" + ((StringNode) node.Value).value+"\"");
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
                if (((MethodCallNode) node.Value).Identifier.value.equals("readNumber")){ //TODO do not do this, give methods return types instead
                    this.Visit((MethodCallNode) node.Value);
                    emit("astore " + getReference("Number/" + node.Target.value));
                }
            }else if (node.Value instanceof ForNode) {
                String loopCount = this.Visit((ForNode) node.Value);
                boolean Break = false;

                Break = GetBreakInChildren(node.Value);

                if (!Break){
                    emit("fload " + getReference("Number/" + ((ForNode) node.Value).Id.value));
                    emit("fconst_1");
                    emit("fsub");
                    emit("fstore " + getReference("Number/" + node.Target.value));
                } else {
                    emit("fload " + getReference("Number/" + ((ForNode) node.Value).Id.value));
                    emit("fstore " + getReference("Number/" + node.Target.value));
                }
            } else if (node.Value instanceof IfNode) {
                this.Visit((IfNode) node.Value);
                this.Visit(((IfNode) node.Value).Predicate);
                emit("i2f");
                emit("fstore " + getReference("Number/" + node.Target.value));
            }else if (node.Value instanceof WhileNode){
                emit("ldc 0.0");
                emit("fstore_0");
                this.Visit((WhileNode) node.Value);
                emit("fload_0");
                emit("fstore " + getReference("Number/" + node.Target.value));
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
        }
        emit("ifeq falselabel" + boolID);
        //Then check if the second operand is true
        if(node.RightOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.RightOperand).value);
        }else {
            this.Visit(node.RightOperand);
        }
        emit("ifeq falselabel" + boolID);//If right operand is false, jump til end

        emit("iconst_1");
        emit("goto endlabel" + boolID);

        emit("falselabel" + boolID + ":");
        emit("iconst_0");
        emit("endlabel" + boolID + ":");
        emit("i2f");
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

    private void BoolLoadNumber(BinaryOperator node){
        if(node.LeftOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.LeftOperand).value);
        }else if(node.LeftOperand instanceof IdNode){
            emit("fload " + getReference("Number/" +((IdNode) node.LeftOperand).value));
        }else{
            this.Visit(node.LeftOperand);
        }
        if(node.RightOperand instanceof  NumberNode){
            emit("ldc " + ((NumberNode)node.RightOperand).value);
        }else if(node.RightOperand instanceof IdNode){
            emit("fload " + getReference("Number/" +((IdNode) node.RightOperand).value));
        }else{
            this.Visit(node.RightOperand);
        }
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
        emit("i2f");
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
        }
        emit("ifne truelabel" + boolID);
        //Then check if the second operand is true
        if(node.RightOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.RightOperand).value);
        }else {
            this.Visit(node.RightOperand);
        }
        emit("ifne truelabel" + boolID);//If right operand is true, jump til end and push true

        emit("iconst_0"); //If both are false, push false and end
        emit("goto endlabel" + boolID);

        emit("truelabel" + boolID + ":"); //If even one is true, push true
        emit("iconst_1");
        emit("endlabel" + boolID + ":");
        emit("i2f");

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

        emit("fconst_1");
        emit("fload_0");
        emit("fadd");
        emit("fstore_0");

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
        int loops = 0;
        //Init
        if (!(VarTable.containsKey("Number/" + node.init.Identifier))) {
            this.Visit(node.init);
        }
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
        emit("fload " + getReference("Number/" + (node.Id.value)));
        emit("fadd");
        emit("fstore " + getReference("Number/" + (node.Id.value)));
        loops++;
        //Loop back
        emit("goto LoopStart" + loopID);
        //Or end
        emit("BranchEnd" + blockID + ":");
        return Integer.toString(loops);
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
        switch (node.Type.value) {
            case "number":
                VarTable.put("Number/" + node.Identifier.value, nextID);
                break;
            case "string":
                VarTable.put("String/" + node.Identifier.value, nextID);
                break;
            case "Class":
                int ThisId = incrementer.GetNextID();
                emit("new com/company/" + node.Identifier.value);
                emit("dup");
                emit("invokespecial com/company/" + node.Identifier.value + ".<init>()V");
                emit("aload " + ThisId);
                VarTable.put(node.Identifier.value, ThisId);
                break;
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

    private void LoadNumber(BinaryOperator node) {
        if(node.LeftOperand instanceof NumberNode) {
            emit("ldc " +  ((NumberNode)node.LeftOperand).value);
        } else if (node.LeftOperand instanceof IdNode){
            emit("fload " +  getReference("Number/" + ((IdNode)node.LeftOperand).value));
        } else if (node.LeftOperand instanceof IMath) {
            this.Visit(node.LeftOperand);
        } else{
            this.Visit(node.LeftOperand);
            emit("i2f");
        }

        if(node.RightOperand instanceof  NumberNode){
            emit("ldc " + ((NumberNode)node.RightOperand).value);
        }else if (node.RightOperand instanceof IdNode){
            emit("fload " +  getReference("Number/" + ((IdNode)node.RightOperand).value));
        }else if (node.RightOperand instanceof IMath) {
            this.Visit(node.RightOperand);
        } else {
            this.Visit(node.RightOperand);
            emit("i2f");
        }
    }

    @Override
    public String Visit(MethodCallNode node) {
        int nextID;
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
                } else if (currentParam instanceof IMath){
                    printNumberFromStack(currentParam);
                } else if (currentParam instanceof BinaryOperator){
                    printNumberFromStack(currentParam);
                    emit("i2f");
                } else if (currentParam.Children.get(0) instanceof NumberNode) {                                                //Its saved as a math node, so its hidden in children. Could make a fix in MyVisitor to add NumberNodes directly to avoid this.
                    printStuff(((NumberNode) currentParam.Children.get(0)).value);
                }
            }
        } else if (node.Identifier.value.equals("read")) {
            scanCall();
        } else if (node.Identifier.value.equals("readNumber")) {
            scanNumberCall();
        } else if (node.Parameters != null){

            StringBuilder params = new StringBuilder();
            for (int i = 0; i < node.Parameters.size(); i++) {
                if(node.Parameters.get(i) instanceof IdNode){
                    IdNode currentNode = (IdNode) node.Parameters.get(i);

                    if (VarTable.containsKey("Number/" + (currentNode.value))){
                        emit("fload " +  getReference("Number/" + (currentNode.value)));
                        params.append("F");

                    } else if (VarTable.containsKey("String/" + (currentNode.value))){
                        emit("aload " +  getReference("String/" + (currentNode.value)));
                        params.append("Ljava/lang/String;");
                    }
                }else if(node.Parameters.get(i) instanceof StringNode){
                    emit("ldc \""+ ((StringNode) node.Parameters.get(i)).value +"\"");
                    params.append("Ljava/lang/String;");

                }else if(node.Parameters.get(i) instanceof IMath){
                    this.Visit(node.Parameters.get(i));
                    params.append("F");

                }else if(node.Parameters.get(i) instanceof NumberNode){
                    emit("ldc "+ ((NumberNode) node.Parameters.get(i)).value);
                    params.append("F");
                }
            }
            emit("invokestatic " + "Out/" + node.Identifier.value + "(" + params + ")V");//TODO Add support for method call from classes
        } else { //TODO make sure this works
            emit("invokestatic " + "Out/" + node.Identifier.value + "()V");
        }
        return null;
    }

    @Override
    public String Visit(MethodDeclerationNode node) {
        methods.add(node);
        return null;
    }

    @Override
    public String Visit(BreakNode node) {
        emit("goto BranchEnd" + loopIncrementer.ID);
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

    private boolean GetBreakInChildren(AbstractNodeBase node){
        if (node instanceof BreakNode){
            return true;
        } else if (node instanceof ForNode){
            for (AbstractNodeBase statement : ((ForNode) node).Statements){
                if (GetBreakInChildren(statement)){
                    return true;
                }
            }
        } else if (node instanceof IfNode){
            for (AbstractNodeBase statement : ((IfNode) node).Statements){
                if (GetBreakInChildren(statement)){
                    return true;
                }
            }
        }
        return false;
    }

    public void EmitMethods() {
        for (MethodDeclerationNode node: methods)
        {
            emit("\n");
            StringBuilder paraTypes = new StringBuilder();
            StringBuilder storeParams = new StringBuilder();
            Incrementer local = new Incrementer();
            int nextID;
            if (node.Parameters != null){
                paraTypes.append("(");
                for (int i=0; i<node.Parameters.size(); i++) {
                    nextID = local.GetNextID();
                    String typeValue = node.Types.get(i).value;
                    String paramValue = node.Parameters.get(i).value;
                    if (typeValue.equals("number")) {
                        paraTypes.append("F");
                        VarTable.put("Number/" + paramValue, nextID);

                    } else if (typeValue.equals("string")) {
                        paraTypes.append("Ljava/lang/String;");
                        VarTable.put("String/" + paramValue, nextID);

                    } else {
                        VarTable.put(typeValue + "/" + paramValue, nextID);
                    }
                }
                paraTypes.append(")");
                emit(".method public static " + node.Identifier.value + paraTypes + "V");
                incrementer.ID = local.GetNextID();
                genPrintStream();
                genInputScanner();
                for (AbstractNodeBase a:  node.Statements) {
                    this.Visit(a);
                }
            } else { //TODO create declaration for parameterless methods
                emit(".method public static " + node.Identifier.value + "()V");
                genPrintStream();
                genInputScanner();
                for (AbstractNodeBase a:  node.Statements) {
                    this.Visit(a);
                }
            }

            genEnd();
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
        genPrintStream();
        genInputScanner();

    }

    public void genInit(){
        emit(".method public <init>()V");
        emit("aload_0");
        emit("invokenonvirtual java/lang/Object/<init>()V");
        emit("return");
        emit(".end method");
    }

    public void genEnd(){
        emit(".limit locals " + (VarTable.size() + 1));
        emit(".limit stack 10");
        emit("return");
        emit(".end method");
    }


    public void genPrintStream(){
            int out = incrementer.GetNextID();
            int printID = printIncrementer.GetNextID();
            VarTable.put("OutStream" + printID, out);
            emit("getstatic java/lang/System/out Ljava/io/PrintStream;");
            emit("astore " + out);
    }

    public void printStuff(float f){
        emit("aload " + VarTable.get("OutStream" + printIncrementer.ID));
        emit("ldc "+ f);
        emit("invokevirtual java/io/PrintStream/println(F)V");
    }

    public void printStuff(String s){
        emit("aload " + VarTable.get("OutStream" + printIncrementer.ID));
        emit("ldc \""+ s +"\"");
        emit("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
    }

    public void printStuff(int reference, String type){
        emit("aload " + VarTable.get("OutStream" + printIncrementer.ID));
        if (type.equals("F")){
            emit("fload " + reference);
        } else {
            emit("aload " + reference);
        }

        emit("invokevirtual java/io/PrintStream/println(" + type + ")V");
    }

    public void printNumberFromStack(AbstractNodeBase node){
        emit("aload " + VarTable.get("OutStream" + printIncrementer.ID));
        this.Visit(node);
        emit("invokevirtual java/io/PrintStream/println(F)V");
    }

    public void printStringFromStack(AbstractNodeBase node){
        emit("aload " + VarTable.get("OutStream" + printIncrementer.ID));
        this.Visit(node);
        emit("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
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
        emit("aload "+ VarTable.get("Scanner"));
        emit("invokevirtual java/util/Scanner.nextLine()Ljava/lang/String;");
    }

    public void scanNumberCall(){
        emit("aload "+ VarTable.get("Scanner"));
        emit("invokevirtual java/util/Scanner.nextLine()F");
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
