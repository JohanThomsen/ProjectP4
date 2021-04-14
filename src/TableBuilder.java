public class TableBuilder {

    public SymbolTable TableBuild(SymbolTable Target, AbstractNodeBase AST) {
        ASTTypeCheck check = new ASTTypeCheck(Target);
        for (int i = 0; i < AST.Children.size(); i++) {

            if(AST.Children.get(i) instanceof MethodDCLNode) {

                Target.enterSymbol(((MethodDCLNode) AST.Children.get(i)).ID.value, "method");
                check.Table = Target;

            } else if(AST.Children.get(i) instanceof InitializationNode) {
                if (check.Visit(AST.Children.get(i)) != null) {
                    Target.enterSymbol(((InitializationNode) AST.Children.get(i)).Identifier.value, ((InitializationNode) AST.Children.get(i)).Type.value);
                    check.Table = Target;
                } else {
                    System.out.println(((InitializationNode) AST.Children.get(i)).Type.value + " type has not been declared yet");
                }

            } else if(AST.Children.get(i) instanceof ClassDCLNode) {

                Target.enterSymbol(((ClassDCLNode) AST.Children.get(i)).ID.value, "class");
                check.Table = Target;

            } else if(AST.Children.get(i) instanceof AssignNode){
                if(check.Visit(AST.Children.get(i)) == "error"){
                    System.out.println("error");
                }
            }
            else {
                check.Visit(AST.Children.get(i));
            }

        }
        return Target;
    }
}
