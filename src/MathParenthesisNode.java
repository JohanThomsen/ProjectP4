import java.util.ArrayList;

public class MathParenthesisNode extends AbstractNodeBase  implements IMath{
    public AbstractNodeBase Operand;

    public MathParenthesisNode(AbstractNodeBase Node){
        Operand = Node;
    }
}
