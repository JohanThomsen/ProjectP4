import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

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
}