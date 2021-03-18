import java.util.ArrayList;

public class AbstractNodeBase {
    ArrayList<AbstractNodeBase> Children = new ArrayList<AbstractNodeBase>();

    public AbstractNodeBase(AbstractNodeBase node){
        this.Children.addAll(node.Children);
    }

    public AbstractNodeBase(){};
}
