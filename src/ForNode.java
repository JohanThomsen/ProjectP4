import java.util.ArrayList;

public class ForNode extends AbstractNodeBase implements IScopable {
    InitializationNode init;
    AssignNode assign;
    IdNode Id;
    AbstractNodeBase From;
    AbstractNodeBase To;
    AbstractNodeBase Predicate;
    ArrayList<AbstractNodeBase> Statements;


    public ForNode(IdNode id, AbstractNodeBase from, AbstractNodeBase to, ArrayList<AbstractNodeBase> statements) {
        init = new InitializationNode(new IdNode("number"), id);
        assign = new AssignNode(id, from);
        Id = id;
        From = from;
        To = to;
        Predicate = new BoolLessEqualNode(getPredicateValues(Id, To));
        Statements = statements;
    }


    private ArrayList<AbstractNodeBase> getPredicateValues(AbstractNodeBase Id, AbstractNodeBase to) {
        ArrayList<AbstractNodeBase> PredicateValues = new ArrayList<AbstractNodeBase>();
        PredicateValues.add(Id);
        PredicateValues.add(to);
        return PredicateValues;
    }
}
