import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class MethodDeclerationNode extends AbstractNodeBase{
    IdNode Identifier;
    ArrayList<IdNode> Parameters;
    ArrayList<IdNode> Types;
    ArrayList<AbstractNodeBase> Statements;

    public MethodDeclerationNode(IdNode identifier, ArrayList<IdNode> parameters, ArrayList<IdNode> types, ArrayList<AbstractNodeBase> statements) {
        Identifier = identifier;
        Parameters = parameters;
        Types = types;
        Statements = statements;
    }

    public MethodDeclerationNode(IdNode identifier, ArrayList<AbstractNodeBase> statements) {
        Identifier = identifier;
        Statements = statements;
    }
}
