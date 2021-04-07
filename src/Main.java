import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
/*import java.io.PrintStream;*/
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {

	    try{
	        MyVisitor visitor = new MyVisitor();
	        SymbolTable Table = new SymbolTable();
	        TableBuilder Builder = new TableBuilder();
	        String source = "test.txt";
	        CharStream stream = fromFileName(source);
	        gLexer lexer = new gLexer(stream);
	        CommonTokenStream token = new CommonTokenStream(lexer);
            gParser parser = new gParser(token);
            ParseTree tree = parser.program();

            AbstractNodeBase node = visitor.visit(tree);

            Table = Builder.TableBuild(Table, node);
            Table.printCurrentScope();

        }
	    catch(IOException e){
            e.printStackTrace();
        }

    }





}
