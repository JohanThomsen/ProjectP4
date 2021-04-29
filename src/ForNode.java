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
        assign = new AssignNode(id, from.Children.get(0));
        Id = id;
        From = from.Children.get(0);
        To = to.Children.get(0);
        Predicate = new BoolLessEqualNode(getPredicateValues(From, To));
        Statements = statements;
    }


    private ArrayList<AbstractNodeBase> getPredicateValues(AbstractNodeBase from, AbstractNodeBase to) {
        ArrayList<AbstractNodeBase> PredicateValues = new ArrayList<AbstractNodeBase>();
        PredicateValues.add(from);
        PredicateValues.add(to);
        return PredicateValues;
    }
}
