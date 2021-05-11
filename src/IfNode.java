import java.util.ArrayList;

public class IfNode extends AbstractNodeBase implements IScopable {
    AbstractNodeBase Predicate;
    ArrayList<AbstractNodeBase> Statements;

    public IfNode(AbstractNodeBase predicate, ArrayList<AbstractNodeBase> statements) {
        Predicate = predicate;
        Statements = statements;
    }
}
