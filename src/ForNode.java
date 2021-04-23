import java.util.ArrayList;

public class ForNode extends AbstractNodeBase {
    AbstractNodeBase From;
    AbstractNodeBase To;
    ArrayList<AbstractNodeBase> Statements;

    public ForNode(AbstractNodeBase from, AbstractNodeBase to, ArrayList<AbstractNodeBase> statements) {
        From = from;
        To = to;
        Statements = statements;
    }
}
