public class BoolParenthesisNode extends AbstractNodeBase{
    public AbstractNodeBase Operand;

    public BoolParenthesisNode(AbstractNodeBase Node){
        Operand = Node;
    }
}
