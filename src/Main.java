import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

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
}
