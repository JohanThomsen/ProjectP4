import java.util.ArrayList;

public class TableBuilder {

    public SymbolTable TableBuild(SymbolTable Target, AbstractNodeBase AST) {
        ASTTypeCheck check = new ASTTypeCheck(Target);

        ArrayList<String> PrimTypes = new ArrayList<>();
        PrimTypes.add("string");
        PrimTypes.add("number");

        PrimTypes.forEach((primType) -> {
            Target.enterSymbol(primType, primType);
        });

        AST.Children.forEach((node) -> {
            BuildTableRec(Target, node, check);
        });

        return Target;
    }

    private void BuildTableRec(SymbolTable Target, AbstractNodeBase CurrentNode, ASTTypeCheck check) {

        if (CurrentNode instanceof MethodDeclerationNode) {

            Target.enterSymbol(((MethodDeclerationNode) CurrentNode).Identifier.value, "method");
            check.Table = Target;

        } else if (CurrentNode instanceof InitializationNode) {
            if (check.Visit(CurrentNode) != null) {
                Target.enterSymbol(((InitializationNode) CurrentNode).Identifier.value, ((InitializationNode) CurrentNode).Type.value);
            } else {
                System.out.println(((InitializationNode) CurrentNode).Type.value + " type has not been declared yet");
            }

        } else if (CurrentNode instanceof ForNode) {
            check.Table.openScope();

            Target.enterSymbol(((ForNode) CurrentNode).Id.value, "number");

            ((ForNode) CurrentNode).Statements.forEach((statement) -> {
                BuildTableRec(Target, statement, check);
            });

            if ((check.Visit(CurrentNode) == null)) {
                System.out.println("Error"); //Todo Make this an exception or something else
            }

            check.Table.printCurrentScope();
            check.Table.closeScope();
        } else if (CurrentNode instanceof IfNode || CurrentNode instanceof WhileNode) {

            check.Table.openScope();
            System.out.println(check.Table.Depth);
            if (CurrentNode instanceof IfNode) {
                ((IfNode) CurrentNode).Statements.forEach((statement) -> {
                    BuildTableRec(Target, statement, check);
                });
            } else {
                ((WhileNode) CurrentNode).Statements.forEach((statement) -> {
                    BuildTableRec(Target, statement, check);
                });
            }

            if ((check.Visit(CurrentNode) == null)) {
                System.out.println("Error in If or While node"); //Todo Make this an exception or something else, also right now it will never be reached
            }

            check.Table.printCurrentScope();
            check.Table.closeScope();
        } else if (CurrentNode instanceof ClassDCLNode) {
            if(check.Visit(CurrentNode).equals("fine")){
                Target.enterSymbol(((ClassDCLNode) CurrentNode).Identifier.value, "class");
                check.Table = Target;
            }else{
                System.out.println("Class " + ((ClassDCLNode) CurrentNode).Identifier.value + " has already been declared");
            }


        } else {
            check.Table = Target;
            check.Visit(CurrentNode);
        }
    }

    /*private void BuildTableRec(SymbolTable Target, AbstractNodeBase AST, ASTTypeCheck check) {
        for (int i = 0; i < AST.Children.size(); i++) {
            AbstractNodeBase CurrentNode = AST.Children.get(i);

            if (CurrentNode instanceof MethodDeclerationNode) {

                Target.enterSymbol(((MethodDeclerationNode) CurrentNode).Identifier.value, "method");
                check.Table = Target;

            } else if (CurrentNode instanceof InitializationNode) {
                if (check.Visit(CurrentNode) != null) {
                    Target.enterSymbol(((InitializationNode) CurrentNode).Identifier.value, ((InitializationNode) CurrentNode).Type.value);
                } else {
                    System.out.println(((InitializationNode) CurrentNode).Type.value + " type has not been declared yet");
                }

            } else if (CurrentNode instanceof ForNode) {
                check.Table.openScope();
                Target.enterSymbol(((ForNode) CurrentNode).Id.value, "number");
                if ((check.Visit(CurrentNode) == null)) {
                    System.out.println("Error"); //Todo Make this an exception or something else
                }
                ((ForNode) CurrentNode).Statements.forEach((statement) -> {

                });
                check.Table.printCurrentScope();
                check.Table.closeScope();
            }
            else if (CurrentNode instanceof ClassDCLNode) {
                if(check.Visit(CurrentNode).equals("fine")){
                    Target.enterSymbol(((ClassDCLNode) CurrentNode).Identifier.value, "class");
                    check.Table = Target;
                }else{
                    System.out.println("Class " + ((ClassDCLNode) CurrentNode).Identifier.value + " has already been declared");
                }


            } else {
                check.Table = Target;
                check.Visit(CurrentNode);
            }
        }
    }*/
}
