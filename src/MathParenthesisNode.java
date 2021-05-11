import java.util.ArrayList;

public class MathParenthesisNode extends AbstractNodeBase{
    public AbstractNodeBase Operand;

    public MathParenthesisNode(AbstractNodeBase Node){
        Operand = Node;
    }
}
