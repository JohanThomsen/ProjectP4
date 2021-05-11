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

        PrimTypes.forEach((primType) -> Target.enterSymbol(primType, primType));
        CheckChildren(Target, errors, check, AST.Children);

        return Target;
    }

    private void CheckChildren(SymbolTable Target, ArrayList<String> errors, ASTTypeCheck check, ArrayList<AbstractNodeBase> children) {
        children.forEach((node) -> BuildTableRec(Target, node, check, errors));
    }

    private void BuildTableRec(SymbolTable Target, AbstractNodeBase CurrentNode, ASTTypeCheck check, ArrayList<String> errors) {

        if (CurrentNode instanceof MethodDeclerationNode) {
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
                Target.printCurrentScope();
                check.Table.closeScope();
            }
        } else if (CurrentNode instanceof InitializationNode) {
            if (check.Visit(CurrentNode) != null) {
                Target.enterSymbol(((InitializationNode) CurrentNode).Identifier.value, ((InitializationNode) CurrentNode).Type.value);
            }
        } else if (CurrentNode instanceof ForNode) {
            check.Table.openScope();
            Target.enterSymbol(((ForNode) CurrentNode).Id.value, "number");
            check.Visit(CurrentNode);

            CheckChildren(Target, errors, check, ((ForNode) CurrentNode).Statements);

            check.Table.closeScope();
        } else if (CurrentNode instanceof IfNode || CurrentNode instanceof WhileNode) {

            check.Table.openScope();
            check.Visit(CurrentNode);

            if (CurrentNode instanceof IfNode) {
                CheckChildren(Target, errors, check, ((IfNode) CurrentNode).Statements);
            } else {
                CheckChildren(Target, errors, check, ((WhileNode) CurrentNode).Statements);
            }

            check.Table.closeScope();
        } else if (CurrentNode instanceof ClassDCLNode) {
            if (check.Visit(CurrentNode).equals("fine")) {
                Target.enterSymbol(((ClassDCLNode) CurrentNode).Identifier.value, "class");
                check.Table = Target;
            }

        }else if (CurrentNode instanceof AssignNode) {
            BuildTableRec(Target, ((AssignNode) CurrentNode).Value, check, errors);
        } else {
            check.Table = Target;
            check.Visit(CurrentNode);
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
        //return TypesString.deleteCharAt(TypesString.lastIndexOf(",")).toString();
    }

    private void addBuiltinFunctionWithStringParam(String name, SymbolTable Target, ASTTypeCheck check) {
        Target.enterSymbol(name, "method" +"(" + "string" + ")");
        check.Table.openScope();
        Target.enterSymbol("s", "string");
        //BuiltIn functions do not have child statements, so no reason to do CheckChildren
        check.Table.closeScope();
    }
}




        /*for (int i = 0; i < AST.Children.size(); i++) {

            if (AST.Children.get(i) instanceof MethodDeclerationNode) {

                Target.enterSymbol(((MethodDeclerationNode) AST.Children.get(i)).Identifier.value, "method");
                check.Table = Target;

            } else if (AST.Children.get(i) instanceof InitializationNode) {
                if (check.Visit(AST.Children.get(i)) != null) {
                    Target.enterSymbol(((InitializationNode) AST.Children.get(i)).Identifier.value, ((InitializationNode) AST.Children.get(i)).Type.value);
                } else {
                    System.out.println(((InitializationNode) AST.Children.get(i)).Type.value + " type has not been declared yet");
                }

            } else if (AST.Children.get(i) instanceof ClassDCLNode) {
                if(check.Visit(AST.Children.get(i)).equals("fine")){
                    Target.enterSymbol(((ClassDCLNode) AST.Children.get(i)).Identifier.value, "class");
                    check.Table = Target;
                }else{
                    System.out.println("Class " + ((ClassDCLNode) AST.Children.get(i)).Identifier.value + " has already been declared");
                }


            } else {
                check.Table = Target;
                check.Visit(AST.Children.get(i));

            }

        }
        return Target;
    }
}*/
