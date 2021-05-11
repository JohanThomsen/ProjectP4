import java.util.ArrayList;

public class AssignNode extends AbstractNodeBase{
    IdNode Target;
    AbstractNodeBase Value;
    AbstractNodeBase attributes = new AbstractNodeBase();

    public AssignNode(){

    }
    public AssignNode(IdNode target, AbstractNodeBase value){
        Target = target;
        Value = value;
    }
}
