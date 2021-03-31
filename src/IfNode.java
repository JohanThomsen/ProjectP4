import java.util.ArrayList;

public class IfNode extends AbstractNodeBase {
    AbstractNodeBase Predicate;
    ArrayList<AbstractNodeBase> Statements;

    public IfNode(AbstractNodeBase predicate, ArrayList<AbstractNodeBase> statements) {
        Predicate = predicate;
        Statements = statements;
    }
}
