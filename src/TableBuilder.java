import java.lang.annotation.Target;
import java.util.ArrayList;

public class TableBuilder {

    public SymbolTable TableBuild(SymbolTable Target, AbstractNodeBase AST, ArrayList<String> errors) {
        ASTTypeCheck check = new ASTTypeCheck(Target, errors);

        ArrayList<String> PrimTypes = new ArrayList<>();
        PrimTypes.add("string");
        PrimTypes.add("number");

        addBuiltinFunctionWithStringParam("print", Target, check);
        addBuiltinFunctionWithStringParam("read", Target, check);
        addBuiltinFunctionWithStringParam("readNumber", Target, check);

        PrimTypes.forEach((primType) -> Target.enterSymbol(primType, primType));
        CheckChildren(Target, errors, check, AST.Children);

        return Target;
    }

    private void CheckChildren(SymbolTable Target, ArrayList<String> errors, ASTTypeCheck check, ArrayList<AbstractNodeBase> children) {
        children.forEach((node) -> BuildTableRec(Target, node, check, errors));
    }

    private void BuildTableRec(SymbolTable Target, AbstractNodeBase CurrentNode, ASTTypeCheck check, ArrayList<String> errors) {

        if (CurrentNode instanceof MethodDeclerationNode) {
            CheckMethodDeclaration(Target, CurrentNode, check, errors);
        } else if (CurrentNode instanceof InitializationNode) {
            CheckInitMethod(Target, CurrentNode, check);
        } else if (CurrentNode instanceof ForNode) {
            CheckForNode(Target, CurrentNode, check, errors);
        } else if (CurrentNode instanceof IfNode || CurrentNode instanceof WhileNode) {
            CheckIfWhileNode(Target, CurrentNode, check, errors);
        } else if (CurrentNode instanceof AssignNode) {
            BuildTableRec(Target, ((AssignNode) CurrentNode).Value, check, errors);
        } else {
            check.Table = Target;
            check.Visit(CurrentNode);
        }
    }

    private void CheckIfWhileNode(SymbolTable Target, AbstractNodeBase CurrentNode, ASTTypeCheck check, ArrayList<String> errors) {
        check.Table.openScope();
        check.Visit(CurrentNode);

        if (CurrentNode instanceof IfNode) {
            CheckChildren(Target, errors, check, ((IfNode) CurrentNode).Statements);
        } else {
            CheckChildren(Target, errors, check, ((WhileNode) CurrentNode).Statements);
        }

        check.Table.closeScope();
    }

    private void CheckForNode(SymbolTable Target, AbstractNodeBase CurrentNode, ASTTypeCheck check, ArrayList<String> errors) {
        check.Table.openScope();
        Target.enterSymbol(((ForNode) CurrentNode).Id.value, "number");
        check.Visit(CurrentNode);

        CheckChildren(Target, errors, check, ((ForNode) CurrentNode).Statements);

        check.Table.closeScope();
    }

    private void CheckInitMethod(SymbolTable Target, AbstractNodeBase CurrentNode, ASTTypeCheck check) {
        if (check.Visit(CurrentNode) != null) {
            Target.enterSymbol(((InitializationNode) CurrentNode).Identifier.value, ((InitializationNode) CurrentNode).Type.value);
        }
    }

    private void CheckMethodDeclaration(SymbolTable Target, AbstractNodeBase CurrentNode, ASTTypeCheck check, ArrayList<String> errors) {
        if (check.Visit(CurrentNode).equals("Success")) {
            if (((MethodDeclerationNode) CurrentNode).Parameters != null) {
                Target.enterSymbol(((MethodDeclerationNode) CurrentNode).Identifier.value, "method" + "(" +
                        getMethodTypes(((MethodDeclerationNode) CurrentNode).Types) + ")");
                check.Table.openScope();
                insertParameters(((MethodDeclerationNode) CurrentNode).Types, ((MethodDeclerationNode) CurrentNode).Parameters, Target);
            } else {
                Target.enterSymbol(((MethodDeclerationNode) CurrentNode).Identifier.value, "method");
                check.Table.openScope();
            }
            CheckChildren(Target, errors, check, ((MethodDeclerationNode) CurrentNode).Statements);
            check.Table.closeScope();
        }
    }

    private void insertParameters(ArrayList<IdNode> types, ArrayList<IdNode> parameters, SymbolTable Target) {
        for (int i=0; i<types.size(); i++) {
            Target.enterSymbol(parameters.get(i).value, types.get(i).value);
        }
    }

    private String getMethodTypes(ArrayList<IdNode> types) {
        StringBuilder TypesString = new StringBuilder();
        for (IdNode type : types) {
            TypesString.append(type.value).append(",");
        }
        return TypesString.toString();
    }

    private void addBuiltinFunctionWithStringParam(String name, SymbolTable Target, ASTTypeCheck check) {
        Target.enterSymbol(name, "method" +"(" + "string" + ")");
        check.Table.openScope();
        Target.enterSymbol("s", "string");
        //BuiltIn functions do not have child statements, so no reason to do CheckChildren
        check.Table.closeScope();
    }
}
