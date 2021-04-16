import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;
/*import java.io.PrintStream;*/
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {

	    try{
	        MyVisitor visitor = new MyVisitor();
	        SymbolTable Table = new SymbolTable();
	        TableBuilder Builder = new TableBuilder();
	        String source = "gentest";
	        CharStream stream = fromFileName(source);
	        gLexer lexer = new gLexer(stream);
	        CommonTokenStream token = new CommonTokenStream(lexer);
            gParser parser = new gParser(token);
            ParseTree tree = parser.program();

            AbstractNodeBase node = visitor.visit(tree);

            Table = Builder.TableBuild(Table, node);


            ASTCodeGenVisitor gen = new ASTCodeGenVisitor();
            gen.emit(".class public examples/Count\n" +
                    ".super java/lang/Object\n" +
                    "\n" +
                    ".method public <init>()V\n" +
                    "   aload_0\n" +
                    "   invokenonvirtual java/lang/Object/<init>()V\n" +
                    "   return\n" +
                    ".end method");
            gen.emit(".method public static main([Ljava/lang/String;)V");
            if(node.Children.size() > 0){
                for(int i = 0; i < node.Children.size(); i++){
                    gen.Visit(node.Children.get(i));
                }
            }else{gen.Visit(node);}
            gen.emit("return");
            gen.emit(".end method");


        }
	    catch(IOException e){
            e.printStackTrace();
        }

    }





}
