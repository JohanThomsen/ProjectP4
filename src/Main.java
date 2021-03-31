import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.io.PrintStream;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    PrintStream ps;
    int level;
    public static void main(String[] args) {

	    try{
	        String source = "test.txt";
	        CharStream stream = fromFileName(source);
	        gLexer lexer = new gLexer(stream);
	        CommonTokenStream token = new CommonTokenStream(lexer);
            gParser parser = new gParser(token);
            ParseTree tree = parser.program();

            MyVisitor visitor = new MyVisitor();
            AbstractNodeBase node = visitor.visit(tree);

            SymbolTable Table = new SymbolTable();
            Table = TableBuild(Table, node);
            Table.printCurrentScope();
            ASTTypeCheck test = new ASTTypeCheck();

            AbstractNodeBase NODE = test.Visit(node.Children.get(0));

        }
	    catch(IOException e){
            e.printStackTrace();
        }

    }

    public static SymbolTable TableBuild(SymbolTable Target, AbstractNodeBase AST){

        for (int i = 0; i<AST.Children.size(); i++){
            if(AST.Children.get(i) instanceof MethodDCLNode){

            }else if(AST.Children.get(i) instanceof InitializationNode){
                Target.enterSymbol(((InitializationNode) AST.Children.get(i)).Identifier.value, ((InitializationNode) AST.Children.get(i)).Type.value);
            }else if(AST.Children.get(i) instanceof ClassDCLNode){

            }
        }

        return Target;
    }
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
}
