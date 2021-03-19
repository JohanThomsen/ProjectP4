import java.util.ArrayList;

public class AbstractNodeBase {
    public ArrayList<AbstractNodeBase> Children = new ArrayList<>();

    public AbstractNodeBase(AbstractNodeBase node){
        this.Children.addAll(node.Children);
    }

    public AbstractNodeBase(){}
}
