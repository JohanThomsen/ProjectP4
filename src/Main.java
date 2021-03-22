import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
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
            System.out.println(node.Children.size());
            System.out.println(node.Children.get(1).Children.size());
            if(node.Children.get(1).getClass() == node.getClass()){
                System.out.println("Eureka");
            }
            if(node.Children.get(0).getClass() == node.Children.get(1).getClass()){
                System.out.println("HAHAHAHAHAHAHAHAHAHAHA");
            }
        }
	    catch(IOException e){
            e.printStackTrace();
        }
    }
}
