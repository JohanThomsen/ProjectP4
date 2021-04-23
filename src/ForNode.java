import java.util.ArrayList;

public class ForNode extends AbstractNodeBase {
    IdNode Id;
    AbstractNodeBase From;
    AbstractNodeBase To;
    AbstractNodeBase Predicate;
    ArrayList<AbstractNodeBase> Statements;


    public ForNode(IdNode id, AbstractNodeBase from, AbstractNodeBase to, ArrayList<AbstractNodeBase> statements) {
        Id = id;
        From = from;
        To = to;
        Predicate = new BoolLessEqualNode(getPredicateValues(from, to));
        Statements = statements;
    }


    private ArrayList<AbstractNodeBase> getPredicateValues(AbstractNodeBase from, AbstractNodeBase to) {
        ArrayList<AbstractNodeBase> PredicateValues = new ArrayList<AbstractNodeBase>();
        PredicateValues.add(from);
        PredicateValues.add(to);
        return PredicateValues;
    }
}
