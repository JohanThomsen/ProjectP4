import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ASTTypeCheckTest {
    SymbolTable table = new SymbolTable();
    ArrayList<String> errors = new ArrayList<>();
    ASTTypeCheck ast = new ASTTypeCheck(table, errors);

    @Test
    void visitStringNode_ShouldReturnString() {
        StringNode input = new StringNode("Hello World");
        String res = ast.Visit(input);
        assertEquals("string", res);
    }

    @Test
    void visitInitNode_ShouldFailOnSymbolAlreadyInTable() {
        table.enterSymbol("TestID", "number");
        InitializationNode input = new InitializationNode(new IdNode("number"), new IdNode("TestID"));
        String res = ast.Visit(input);
        assertNull(res);
    }

    @Test
    void visitNumberNode_ShouldReturnNumber() {
        NumberNode input = new NumberNode(0.0f);
        String res = ast.Visit(input);
        assertEquals("number", res);
    }

    @Test
    void visitBreakNode_ShouldFailOnWrongParent() {
        BreakNode input = new BreakNode("IfNode");
        String res = ast.Visit(input);
        assertNull(res);
    }

    @Test
    void visitBreakNode_ShouldSucceedOnLoopParent() {
        BreakNode input0 = new BreakNode("ForNode");
        BreakNode input1 = new BreakNode("WhileNode");
        String res0 = ast.Visit(input0);
        String res1 = ast.Visit(input1);
        assertNull(res0);
        assertNull(res1);
    }

    @ParameterizedTest
    @ValueSource(strings = {"string", "number", "while", "for", "if"})
    void visitAssignNode_StringAssignmentSucceedsOnCorrectInput(String typeInput) {
        AssignNode input;
        String expectedValue;
        ArrayList<AbstractNodeBase> testPredicate = new ArrayList<>();
        testPredicate.add(new NumberNode(10.0f));
        testPredicate.add(new NumberNode(10.0f));

        switch (typeInput) {
            case "string" -> {
                input = new AssignNode(new IdNode("TestID0"), new StringNode("Hello World"));
                ast.Table.enterSymbol("TestID0", typeInput);
                expectedValue = typeInput;
            }
            case "number" -> {
                input = new AssignNode(new IdNode("TestID1"), new NumberNode(0.0f));
                ast.Table.enterSymbol("TestID1", typeInput);
                expectedValue = typeInput;
            }
            case "while" -> {
                input = new AssignNode(new IdNode("TestID2"), new WhileNode(new BoolEqualNode(testPredicate), new ArrayList<>()));
                ast.Table.enterSymbol("TestID2", "number");
                expectedValue = "ctrlStruc";
            }
            case "for" -> {
                input = new AssignNode(new IdNode("TestID3"), new ForNode(new IdNode("x"), new NumberNode(6.0f), new NumberNode(10.0f), new ArrayList<>()));
                ast.Table.enterSymbol("TestID3", "number");
                expectedValue = "ctrlStruc";
            }
            case "if" -> {
                input = new AssignNode(new IdNode("TestID4"), new IfNode(new BoolEqualNode(testPredicate), new ArrayList<>()));
                ast.Table.enterSymbol("TestID4", "number");
                expectedValue = "ctrlStruc";
            }
            default -> {
                input = new AssignNode(new IdNode("TestID"), new AbstractNodeBase());
                expectedValue = typeInput;
            }
        }
        String res = ast.Visit(input);
        assertEquals(expectedValue, res);
    }

    @Test
    void visitMath_ShouldReturnNumberOnSuccess() {
        // (5+10)/3
        MathDivNode math = new MathDivNode(new ArrayList<AbstractNodeBase>(List.of(
                new MathParenthesisNode(
                        new MathAddNode(new ArrayList<AbstractNodeBase>(List.of(
                                new NumberNode(5.0f),
                                new NumberNode(10.0f))))),
                new NumberNode(3.0f))));

        String res = ast.Visit(math);
        assertEquals("number", res);
    }

    @Test
    void visitMath_ShouldReturnErrorOnFailure() {
        // (5+10)/3
        MathDivNode math = new MathDivNode(new ArrayList<AbstractNodeBase>(List.of(
                new MathParenthesisNode(
                        new MathAddNode(new ArrayList<AbstractNodeBase>(List.of(
                                new StringNode("Suffer"),
                                new NumberNode(10.0f))))),
                new NumberNode(3.0f))));

        String res = ast.Visit(math);
        assertEquals("error", res);
        assertFalse(ast.Errors.isEmpty());
    }

    @Test
    void visitBool_ShouldReturnNumberOnSuccess() {
        // !((true || false) && true)
        var bool = new BoolNotNode(
                new BoolParenthesisNode(
                        new BoolAndNode(new ArrayList<>(List.of(
                                new BoolParenthesisNode(
                                        new BoolOrNode(new ArrayList<>(List.of(
                                                new NumberNode(1.0f),
                                                new NumberNode(0.0f)
                                        )))),
                                new NumberNode(1.0f)
                        ))))
        );

        String res = ast.Visit(bool);
        assertEquals("number", res);
    }

    @Test
    void visitBool_ShouldReturnErrorOnFailure() {
        // !((true || false) && true)
        var bool = new BoolNotNode(
                new BoolParenthesisNode(
                new BoolAndNode(new ArrayList<>(List.of(
                        new BoolParenthesisNode(
                            new BoolOrNode(new ArrayList<>(List.of(
                                    new NumberNode(1.0f),
                                    new NumberNode(0.0f)
                        )))),
                        new StringNode("1.0f")
                ))))
        );

        String res = ast.Visit(bool);
        assertEquals("error", res);
    }

    @Test
    void visitMethodCall_SuccessOnPredifinedMethods() {
        MethodCallNode methodCallPrint = new MethodCallNode(new IdNode("print"), new ArrayList<>(List.of(new StringNode("Hello Test"))));
        MethodCallNode methodCallRead = new MethodCallNode(new IdNode("read"));

        ast.Table.enterSymbol("print", "method" + "(" + "string" + ")");
        ast.Table.enterSymbol("read", "method" + "(" + "string" + ")");

        String res1 = ast.Visit(methodCallPrint);
        String res2 = ast.Visit(methodCallRead);

        assertEquals("Success", res1);
        assertEquals("string", res2);
    }

    @Test
    void visitMethodDcl_Success() {
        MethodDeclerationNode methodDcl = new MethodDeclerationNode(
                new IdNode("Test"),
                new ArrayList<IdNode>(List.of(
                        new IdNode("param1"),
                        new IdNode("param2"))),
                new ArrayList<IdNode>(List.of(
                        new IdNode("string"),
                        new IdNode("number")
                )),
                new ArrayList<>()
        );

        //primitives
        ast.Table.enterSymbol("number", "number");
        ast.Table.enterSymbol("string", "string");

        ast.Table.enterSymbol("Test", "method" + "(" + "string" + ")");
        ast.Table.enterSymbol("param1", "String");
        ast.Table.enterSymbol("param2", "Number");

        String res = ast.Visit(methodDcl);
        assertEquals("Success", res);
    }

    @Test
    void visitMethodCall_SuccessOnUserMethods() {
        MethodCallNode methodCallTest = new MethodCallNode(new IdNode("Test"), new ArrayList<>(List.of(new StringNode("Hello Test"))));
        ast.Table.enterSymbol("Test", "method" + "(" + "string" + ")");

        String res = ast.Visit(methodCallTest);

        assertEquals("Success", res);
    }

    @Test
    void visitStringEquals_Success() {
        StringEqualsNode stringEquals = new StringEqualsNode(new ArrayList<>(List.of(new StringNode("This"), new IdNode("This"))));
        ast.Table.enterSymbol("This", "string");

        String res = ast.Visit(stringEquals);

        assertEquals("bool", res);
    }

    @Test
    void visitStringEquals_Failure() {
        StringEqualsNode stringEquals = new StringEqualsNode(new ArrayList<>(List.of(new StringNode("This"), new NumberNode(1.0f))));

        String res = ast.Visit(stringEquals);

        assertEquals("error", res);
        assertFalse(ast.Errors.isEmpty());
    }
}