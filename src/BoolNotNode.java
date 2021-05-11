public class BoolNotNode extends AbstractNodeBase{
    public AbstractNodeBase Operand;

    public BoolNotNode(AbstractNodeBase node) {
        Operand = node;
    }
}