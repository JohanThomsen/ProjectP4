import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.ArrayList;

public class UpdatedParseTreeVisitor<T> extends AbstractParseTreeVisitor<T> {
    protected ArrayList<T> aggregateResult(ArrayList<T> aggregate, ArrayList<T> nextResult) {
        if(aggregate != null && nextResult != null){
            aggregate.addAll(nextResult);
        }
        return (aggregate != null) ? aggregate : nextResult;
    }
}
