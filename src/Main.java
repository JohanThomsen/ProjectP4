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

        ArrayList<String> errors = new ArrayList<>();
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

            Table = Builder.TableBuild(Table, node, errors);

            if (errors.isEmpty()) {
                ASTCodeGenVisitor gen = new ASTCodeGenVisitor();

                gen.genHeader();
                gen.emit(".limit locals 10\n" +
                        ".limit stack 10");
                if(node.Children.size() > 0){
                    for(int i = 0; i < node.Children.size(); i++){
                        gen.Visit(node.Children.get(i));
                    }
                }else{gen.Visit(node);}

                gen.emit("getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                        "astore_1");
                gen.emit("invokestatic java/lang/String/valueOf(F)Ljava/lang/String;\n" +
                        "astore_3\n" +
                        "aload_1\n" +
                        "aload_3\n" +
                        "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");


                gen.genEnd();
            } else {
                errors.forEach(System.out::println);
            }


        }
	    catch(IOException e){
            e.printStackTrace();
        }

    }





}
