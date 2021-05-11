import java.util.ArrayList;

public class MethodCallNode extends AbstractNodeBase{
    public IdNode Identifier;
    public ArrayList<AbstractNodeBase> Parameters;

    public MethodCallNode(IdNode Identifier){
        this.Identifier = Identifier;
    }

    public MethodCallNode(IdNode Identifier, ArrayList<AbstractNodeBase> Parameters){
        this.Identifier = Identifier;
        this.Parameters = Parameters;
    }
}
