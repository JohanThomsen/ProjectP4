import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ASTCodeGenVisitorTest {
    ASTCodeGenVisitor gen = new ASTCodeGenVisitor();
    Scanner scanner;
    File outj = new File("out.j");

    {
        try {
            scanner = new Scanner(outj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"read", "print", "user"})
    void visitMethodCall_Success(String typeInput) {
        MethodCallNode input;
        ArrayList<String> expectedValue = new ArrayList<>();

        switch (typeInput) {
            case "read" -> {
                gen.genInputScanner();
                input = new MethodCallNode(new IdNode("read"));
                gen.Visit(input);

                expectedValue.add("new java/util/Scanner");
                expectedValue.add("dup");
                expectedValue.add("getstatic java/lang/System.in Ljava/io/InputStream;");
                expectedValue.add("invokespecial java/util/Scanner.<init>(Ljava/io/InputStream;)V");
                expectedValue.add("astore 5");
                expectedValue.add("aload 5");
                expectedValue.add("invokevirtual java/util/Scanner.nextLine()Ljava/lang/String;");
            }
            case "print" -> {
                gen.genPrintStream();
                gen.Visit(new InitializationNode(new IdNode("string"), new IdNode("Test")));
                gen.Visit(new AssignNode(new IdNode("Test"), new StringNode("Test")));

                input = new MethodCallNode(new IdNode("print"), new ArrayList<>(List.of(
                        new StringNode("Hello World"),
                        new IdNode("Test"),
                        new MathAddNode(new ArrayList<>(List.of(
                                new NumberNode(1.0f),
                                new NumberNode(1.0f)
                        ))),
                        new BoolEqualNode(new ArrayList<>(List.of(
                                new NumberNode(1.0f),
                                new NumberNode(1.0f)
                        )))
                )));
                gen.Visit(input);

                expectedValue.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
                expectedValue.add("astore 5");
                expectedValue.add("ldc \"Test\"");
                expectedValue.add("astore 6");
                expectedValue.add("aload 5");
                expectedValue.add("ldc \"Hello World\"");
                expectedValue.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
                expectedValue.add("aload 5");
                expectedValue.add("aload 6");
                expectedValue.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
                expectedValue.add("aload 5");
                expectedValue.add("ldc 1.0");
                expectedValue.add("ldc 1.0");
                expectedValue.add("fadd");
                expectedValue.add("invokevirtual java/io/PrintStream/println(F)V");
                expectedValue.add("aload 5");
                expectedValue.add("ldc 1.0");
                expectedValue.add("ldc 1.0");
                expectedValue.add("fcmpl");
                expectedValue.add("ifeq truelabel0");
                expectedValue.add("iconst_0");
                expectedValue.add("goto endlabel0");
                expectedValue.add("truelabel0:");
                expectedValue.add("iconst_1");
                expectedValue.add("endlabel0:");
                expectedValue.add("i2f");
                expectedValue.add("invokevirtual java/io/PrintStream/println(F)V");
            }
            case "user" -> {
                gen.Visit(new InitializationNode(new IdNode("string"), new IdNode("Test1")));
                gen.Visit(new AssignNode(new IdNode("Test1"), new StringNode("Test")));

                input = new MethodCallNode(new IdNode("Test"), new ArrayList<>(List.of(
                        new IdNode("Test1")
                )));
                gen.Visit(input);

                expectedValue.add("ldc \"Test\"");
                expectedValue.add("astore 5");
                expectedValue.add("aload 5");
                expectedValue.add("invokestatic Out/Test(Ljava/lang/String;)V");
            }
        }

        ArrayList<String> output = new ArrayList<>();
        while (scanner.hasNextLine()) {
            output.add(scanner.nextLine());
        }

        assertEquals(expectedValue, output);
    }

    @Test
    void visitMethodDecleration_Success() {
        MethodDeclerationNode input;
        ArrayList<String> expectedValue = new ArrayList<>();

        input = new MethodDeclerationNode(
                new IdNode("Test"),
                new ArrayList<>(List.of(
                        new IdNode("Hello World")
                )),
                new ArrayList<>(List.of(
                        new IdNode("string")
                )),
                new ArrayList<>(List.of(
                        new InitializationNode(new IdNode("string"), new IdNode("Test1")),
                        new AssignNode(new IdNode("Test1"), new StringNode("Test"))
                ))
        );
        gen.Visit(input);
        gen.EmitMethods();

        expectedValue.add("");
        expectedValue.add("");
        expectedValue.add(".method public static Test(Ljava/lang/String;)V");
        expectedValue.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        expectedValue.add("astore 6");
        expectedValue.add("astore 5");
        expectedValue.add("ldc \"Test\"");
        expectedValue.add("astore 7");
        expectedValue.add(".limit locals 8");
        expectedValue.add(".limit stack 10");
        expectedValue.add("return");
        expectedValue.add(".end method");


        ArrayList<String> output = new ArrayList<>();
        while (scanner.hasNextLine()) {
            output.add(scanner.nextLine());
        }

        assertEquals(expectedValue, output);
    }

    @Test
    void visitBool_Success() {
        ArrayList<String> expectedValue = new ArrayList<>();

        // !((true <= false) || false) && (true < (false > true))
        BoolAndNode input = new BoolAndNode(new ArrayList<>(List.of(
                new BoolNotNode(new BoolOrNode(new ArrayList<>(List.of(
                        new BoolLessEqualNode(new ArrayList<>(List.of(
                                new NumberNode(1.0f),
                                new NumberNode(0.0f)
                        ))),
                        new NumberNode(0.0f)
                )))),
                new BoolLessNode(new ArrayList<>(List.of(
                        new NumberNode(1.0f),
                        new BoolGreaterNode(new ArrayList<>(List.of(
                                new NumberNode(0.0f),
                                new NumberNode(1.0f)
                        )))
                )))
        )));
        gen.Visit(input);

        expectedValue.add("ldc 1.0");
        expectedValue.add("ldc 0.0");
        expectedValue.add("fcmpl");
        expectedValue.add("ifle truelabel2");
        expectedValue.add("iconst_0");
        expectedValue.add("goto endlabel2");
        expectedValue.add("truelabel2:");
        expectedValue.add("iconst_1");
        expectedValue.add("endlabel2:");
        expectedValue.add("i2f");
        expectedValue.add("ifne truelabel1");
        expectedValue.add("ldc 0.0");
        expectedValue.add("ifne truelabel1");
        expectedValue.add("iconst_0");
        expectedValue.add("goto endlabel1");
        expectedValue.add("truelabel1:");
        expectedValue.add("iconst_1");
        expectedValue.add("endlabel1:");
        expectedValue.add("i2f");
        expectedValue.add("i2f");
        expectedValue.add("ldc 0.0");
        expectedValue.add("fcmpl");
        expectedValue.add("ifeq truelabel3");
        expectedValue.add("iconst_0");
        expectedValue.add("goto endlabel3");
        expectedValue.add("truelabel3:");
        expectedValue.add("iconst_1");
        expectedValue.add("endlabel3:");
        expectedValue.add("i2f");
        expectedValue.add("ifeq falselabel0");
        expectedValue.add("ldc 1.0");
        expectedValue.add("ldc 0.0");
        expectedValue.add("ldc 1.0");
        expectedValue.add("fcmpl");
        expectedValue.add("ifgt truelabel4");
        expectedValue.add("iconst_0");
        expectedValue.add("goto endlabel4");
        expectedValue.add("truelabel4:");
        expectedValue.add("iconst_1");
        expectedValue.add("endlabel4:");
        expectedValue.add("i2f");
        expectedValue.add("fcmpl");
        expectedValue.add("iflt truelabel5");
        expectedValue.add("iconst_0");
        expectedValue.add("goto endlabel5");
        expectedValue.add("truelabel5:");
        expectedValue.add("iconst_1");
        expectedValue.add("endlabel5:");
        expectedValue.add("i2f");
        expectedValue.add("ifeq falselabel0");
        expectedValue.add("iconst_1");
        expectedValue.add("goto endlabel0");
        expectedValue.add("falselabel0:");
        expectedValue.add("iconst_0");
        expectedValue.add("endlabel0:");
        expectedValue.add("i2f");

        ArrayList<String> output = new ArrayList<>();
        while (scanner.hasNextLine()) {
            output.add(scanner.nextLine());
        }

        assertEquals(expectedValue, output);
    }

    @Test
    void visitMath_Success() {
        gen.Visit(new InitializationNode(new IdNode("number"), new IdNode("Test1")));
        gen.Visit(new AssignNode(new IdNode("Test1"), new NumberNode(1.0f)));
        gen.Visit(new InitializationNode(new IdNode("number"), new IdNode("Test2")));
        gen.Visit(new AssignNode(new IdNode("Test2"), new NumberNode(2.0f)));

        ArrayList<String> expectedValue = new ArrayList<>();
        MathDivNode input = new MathDivNode(new ArrayList<>(List.of(
                new MathMultNode(new ArrayList<>(List.of(
                        new IdNode("Test1"),
                        new IdNode("Test2")
                ))),
                new MathMultNode(new ArrayList<>(List.of(
                        new IdNode("Test1"),
                        new IdNode("Test2")
                )))
        )));
        gen.Visit(input);

        expectedValue.add("ldc 1.0");
        expectedValue.add("fstore 5");
        expectedValue.add("ldc 2.0");
        expectedValue.add("fstore 6");
        expectedValue.add("fload 5");
        expectedValue.add("fload 6");
        expectedValue.add("fmul");
        expectedValue.add("fload 5");
        expectedValue.add("fload 6");
        expectedValue.add("fmul");
        expectedValue.add("fdiv");

        ArrayList<String> output = new ArrayList<>();
        while (scanner.hasNextLine()) {
            output.add(scanner.nextLine());
        }

        assertEquals(expectedValue, output);
    }

    @ParameterizedTest
    @ValueSource(strings = {"string", "number", "id", "method", "while", "for", "if"})
    void visitAssign_Success(String typeInput) {
        AssignNode input;
        ArrayList<String> expectedValue = new ArrayList<>();

        switch (typeInput) {
            case "string" -> {
                gen.Visit(new InitializationNode(new IdNode("string"), new IdNode("Test0")));
                input = new AssignNode(new IdNode("Test0"), new StringNode("Test"));
                gen.Visit(input);

                expectedValue.add("ldc \"" + input.Value + "\"");
                expectedValue.add("astore 5");
            }
            case "number" -> {
                gen.Visit(new InitializationNode(new IdNode("number"), new IdNode("Test1")));
                input = new AssignNode(new IdNode("Test1"), new NumberNode(1.0f));
                gen.Visit(input);

                expectedValue.add("ldc " + ((NumberNode) input.Value).value);
                expectedValue.add("fstore 5");
            }
            case "id" -> {
                gen.Visit(new InitializationNode(new IdNode("number"), new IdNode("Test2")));
                gen.Visit(new InitializationNode(new IdNode("number"), new IdNode("Test2Assign")));
                input = new AssignNode(new IdNode("Test2"), new IdNode("Test2Assign"));
                gen.Visit(input);

                expectedValue.add("fload 6");
                expectedValue.add("fstore 5");

                gen.Visit(new InitializationNode(new IdNode("string"), new IdNode("Test3")));
                gen.Visit(new InitializationNode(new IdNode("string"), new IdNode("Test3Assign")));
                input = new AssignNode(new IdNode("Test3"), new IdNode("Test3Assign"));
                gen.Visit(input);

                expectedValue.add("aload 8");
                expectedValue.add("astore 7");
            }
            case "method" -> {
                gen.genInputScanner();
                gen.Visit(new InitializationNode(new IdNode("string"), new IdNode("Test4")));
                input = new AssignNode(new IdNode("Test4"), new MethodCallNode(new IdNode("read")));
                gen.Visit(input);

                expectedValue.add("new java/util/Scanner");
                expectedValue.add("dup");
                expectedValue.add("getstatic java/lang/System.in Ljava/io/InputStream;");
                expectedValue.add("invokespecial java/util/Scanner.<init>(Ljava/io/InputStream;)V");
                expectedValue.add("astore 5");
                expectedValue.add("aload 5");
                expectedValue.add("invokevirtual java/util/Scanner.nextLine()Ljava/lang/String;");
                expectedValue.add("astore 6");
            }
            case "while" -> {
                gen.Visit(new InitializationNode(new IdNode("number"), new IdNode("Test5")));
                input = new AssignNode(new IdNode("Test5"), new WhileNode(
                        new StringEqualsNode(new ArrayList<>(List.of(
                                new StringNode("that"),
                                new StringNode("that")
                        ))),
                        new ArrayList<>()
                ));
                gen.Visit(input);

                expectedValue.add("ldc 0.0");
                expectedValue.add("fstore_0");

                expectedValue.add("LoopStart" + 0 + ":");

                expectedValue.add("ldc \"" + "that" + "\"");
                expectedValue.add("ldc \"" + "that" + "\"");
                expectedValue.add("invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I");
                expectedValue.add("i2f");
                expectedValue.add("fconst_0");

                expectedValue.add("fcmpl");
                expectedValue.add("ifeq truelabel" + 0);
                expectedValue.add("iconst_0");
                expectedValue.add("goto endlabel" + 0);
                expectedValue.add("truelabel" + 0 + ":");
                expectedValue.add("iconst_1");
                expectedValue.add("endlabel" + 0 + ":");
                expectedValue.add("i2f");

                expectedValue.add("ifeq BranchEnd" + 0);

                expectedValue.add("fconst_1");
                expectedValue.add("fload_0");
                expectedValue.add("fadd");
                expectedValue.add("fstore_0");
                expectedValue.add("goto LoopStart" + 0);
                expectedValue.add("BranchEnd" + 0 + ":");

                expectedValue.add("fload_0");
                expectedValue.add("fstore 5");
            }
            case "for" -> {
                gen.Visit(new InitializationNode(new IdNode("number"), new IdNode("Test6")));
                input = new AssignNode(new IdNode("Test6"), new ForNode(
                        new IdNode("Test7"),
                        new NumberNode(1.0f),
                        new NumberNode(2.0f),
                        new ArrayList<>()
                ));
                gen.Visit(input);

                //Assign
                expectedValue.add("ldc " + 1.0);
                expectedValue.add("fstore " + 6);

                expectedValue.add("LoopStart" + 0 + ":");

                //check Predicate
                expectedValue.add("fload " + 6);
                expectedValue.add("ldc " + 2.0);
                expectedValue.add("fcmpl");
                expectedValue.add("ifle truelabel" + 0);
                expectedValue.add("iconst_0");
                expectedValue.add("goto endlabel" + 0);
                expectedValue.add("truelabel" + 0 + ":");
                expectedValue.add("iconst_1");
                expectedValue.add("endlabel" + 0 + ":");
                expectedValue.add("i2f");

                expectedValue.add("ifeq BranchEnd" + 0);

                //Increment
                expectedValue.add("fconst_1");
                expectedValue.add("fload " + 6);
                expectedValue.add("fadd");
                expectedValue.add("fstore " + 6);

                //Loop back
                expectedValue.add("goto LoopStart" + 0);
                //Or end
                expectedValue.add("BranchEnd" + 0 + ":");

                expectedValue.add("fload " + 6);
                expectedValue.add("fconst_1");
                expectedValue.add("fsub");
                expectedValue.add("fstore " + 5);
            }
            case "if" -> {
                gen.Visit(new InitializationNode(new IdNode("number"), new IdNode("Test6")));
                input = new AssignNode(new IdNode("Test6"), new IfNode(
                        new StringEqualsNode(new ArrayList<>(List.of(
                                new StringNode("that"),
                                new StringNode("that")
                        ))),
                        new ArrayList<>()
                ));
                gen.Visit(input);


                expectedValue.add("ldc \"" + "that" + "\"");
                expectedValue.add("ldc \"" + "that" + "\"");
                expectedValue.add("invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I");
                expectedValue.add("i2f");
                expectedValue.add("fconst_0");

                expectedValue.add("fcmpl");
                expectedValue.add("ifeq truelabel" + 0);
                expectedValue.add("iconst_0");
                expectedValue.add("goto endlabel" + 0);
                expectedValue.add("truelabel" + 0 + ":");
                expectedValue.add("iconst_1");
                expectedValue.add("endlabel" + 0 + ":");
                expectedValue.add("i2f");

                expectedValue.add("ifeq BranchEnd" + 0);
                expectedValue.add("BranchEnd" + 0 + ":");

                expectedValue.add("ldc \"" + "that" + "\"");
                expectedValue.add("ldc \"" + "that" + "\"");
                expectedValue.add("invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I");
                expectedValue.add("i2f");
                expectedValue.add("fconst_0");

                expectedValue.add("fcmpl");
                expectedValue.add("ifeq truelabel" + 1);
                expectedValue.add("iconst_0");
                expectedValue.add("goto endlabel" + 1);
                expectedValue.add("truelabel" + 1 + ":");
                expectedValue.add("iconst_1");
                expectedValue.add("endlabel" + 1 + ":");
                expectedValue.add("i2f");

                expectedValue.add("i2f");
                expectedValue.add("fstore " + 5);
            }
        }

        ArrayList<String> output = new ArrayList<>();
        while (scanner.hasNextLine()) {
            output.add(scanner.nextLine());
        }

        assertEquals(expectedValue, output);
    }
}