import java.io.PrintStream;

public class ASTCodeGenVisitor extends ASTVisitor<String>{

    PrintStream ps;
    int level = 0;
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

    @Override
    public String Visit(AddNode node) {
        return null;
    }

    @Override
    public String Visit(AssignNode node) {
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
    public String Visit(CtrlStrucNode node) {
        return null;
    }

    @Override
    public String Visit(DivisionNode node) {
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
    public String Visit(MathAddNode node) {
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
    public String Visit(MethodCallNode node) {
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
    public String Visit(NumberNode node) {
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
