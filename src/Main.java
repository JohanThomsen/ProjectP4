import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/*import java.io.PrintStream;*/
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> Errors = new ArrayList<>();

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

            Table = Builder.TableBuild(Table, node, Errors);

            if (Errors.isEmpty()){
                CodeGen(node);
            } else {
                Errors.forEach(System.out::println);
            }

        }
	    catch(IOException e){
            e.printStackTrace();
        }

    }

    private static void CodeGen(AbstractNodeBase node) {
        ASTCodeGenVisitor gen = new ASTCodeGenVisitor();

        gen.genMain();

        if(node.Children.size() > 0){
            for(int i = 0; i < node.Children.size(); i++){
                gen.Visit(node.Children.get(i));
            }
        }else{gen.Visit(node);}




        gen.genEnd();
    }


}
