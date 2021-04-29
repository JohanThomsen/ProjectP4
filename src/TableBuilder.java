import java.util.ArrayList;

public class TableBuilder {

    public SymbolTable TableBuild(SymbolTable Target, AbstractNodeBase AST, ArrayList<String> errors) {
        ASTTypeCheck check = new ASTTypeCheck(Target, errors);

        ArrayList<String> PrimTypes = new ArrayList<>();
        PrimTypes.add("string");
        PrimTypes.add("number");

        PrimTypes.forEach((primType) -> {
            Target.enterSymbol(primType, primType);
        });
        AST.Children.forEach((node) -> {
            BuildTableRec(Target, node, check, errors);
        });

        return Target;
    }

    private void BuildTableRec(SymbolTable Target, AbstractNodeBase CurrentNode, ASTTypeCheck check, ArrayList<String> errors) {

        if (CurrentNode instanceof MethodDeclerationNode) {
            Target.enterSymbol(((MethodDeclerationNode) CurrentNode).Identifier.value, "method");
            check.Table = Target;

        } else if (CurrentNode instanceof InitializationNode) {
            if (check.Visit(CurrentNode) != null) {
                Target.enterSymbol(((InitializationNode) CurrentNode).Identifier.value, ((InitializationNode) CurrentNode).Type.value);
            }
        } else if (CurrentNode instanceof ForNode) {
            check.Table.openScope();

            Target.enterSymbol(((ForNode) CurrentNode).Id.value, "number");

            check.Visit(CurrentNode);

            ((ForNode) CurrentNode).Statements.forEach((statement) -> {
                BuildTableRec(Target, statement, check, errors);
            });

            check.Table.closeScope();
        } else if (CurrentNode instanceof IfNode || CurrentNode instanceof WhileNode) {

            check.Table.openScope();

            check.Visit(CurrentNode);

            if (CurrentNode instanceof IfNode) {
                ((IfNode) CurrentNode).Statements.forEach((statement) -> {
                    BuildTableRec(Target, statement, check, errors);
                });
            } else {
                ((WhileNode) CurrentNode).Statements.forEach((statement) -> {
                    BuildTableRec(Target, statement, check, errors);
                });
            }

            check.Table.closeScope();
        } else if (CurrentNode instanceof ClassDCLNode) {
            if (check.Visit(CurrentNode).equals("fine")) {
                Target.enterSymbol(((ClassDCLNode) CurrentNode).Identifier.value, "class");
                check.Table = Target;
            }

        } else {
            check.Table = Target;
            check.Visit(CurrentNode);
        }
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
