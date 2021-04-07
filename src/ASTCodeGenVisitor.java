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
    public String Visit(InitializationNode node) {
        return null;
    }

    @Override
    public String Visit(AssignNode node) {
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
}
