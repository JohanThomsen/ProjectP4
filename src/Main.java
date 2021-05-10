import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import jasmin.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

/*import java.io.PrintStream;*/

public class Main {

    public static void main(String[] args) {

        ArrayList<String> Errors = new ArrayList<>();

        try {
            MyVisitor visitor = new MyVisitor();
            SymbolTable Table = new SymbolTable();
            TableBuilder Builder = new TableBuilder();
            String source = args[0];
            CharStream stream = fromFileName(source);
            gLexer lexer = new gLexer(stream);
            CommonTokenStream token = new CommonTokenStream(lexer);
            gParser parser = new gParser(token);
            ParseTree tree = parser.program();

            AbstractNodeBase node = visitor.visit(tree);

            Table = Builder.TableBuild(Table, node, Errors);

            if (Errors.isEmpty()) {
                CodeGen(node);

                new jasmin.Main().assemble("out.j");

                ProcessBuilder processBuilder;
                if (args.length == 2) {
                    processBuilder = new ProcessBuilder("jar", "-cfe", args[1] + ".jar", "Out", "Out.class");
                } else {
                    processBuilder = new ProcessBuilder("jar", "-cfe", "out.jar", "Out", "Out.class");
                }
                processBuilder.redirectErrorStream(true);
                processBuilder.inheritIO();
                var process = processBuilder.start();
                process.waitFor();

                new File("Out.class").deleteOnExit();
            } else {
                Errors.forEach(System.out::println);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void CodeGen(AbstractNodeBase node) {
        ASTCodeGenVisitor gen = new ASTCodeGenVisitor();

        gen.genMain();

        if (node.Children.size() > 0) {
            for (int i = 0; i < node.Children.size(); i++) {
                gen.Visit(node.Children.get(i));
            }
        } else {
            gen.Visit(node);
        }

        gen.genEnd();
        gen.EmitMethods();
    }


}
