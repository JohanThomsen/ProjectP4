import java.util.ArrayList;

public class MethodCallNode extends AbstractNodeBase{
    IdNode Identifier;
    ArrayList<IdNode> Parameters;

    public MethodCallNode(IdNode Identifier){
        this.Identifier = Identifier;
    }

    public MethodCallNode(IdNode Identifier, ArrayList<IdNode> Parameters){
        this.Identifier = Identifier;
        this.Parameters = Parameters;
    }
}
