import java.util.ArrayList;

public class WhileNode extends AbstractNodeBase implements IScopable {
    AbstractNodeBase Predicate;
    ArrayList<AbstractNodeBase> Statements;

    public WhileNode(AbstractNodeBase predicate, ArrayList<AbstractNodeBase> statements) {
        Predicate = predicate;
        Statements = statements;
    }
}
