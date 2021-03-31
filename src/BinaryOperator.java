import java.util.ArrayList;
abstract class BinaryOperator extends AbstractNodeBase {
    AbstractNodeBase LeftOperand;
    AbstractNodeBase RightOperand;

    public BinaryOperator(ArrayList<AbstractNodeBase> node) {
        LeftOperand = node.get(0);
        RightOperand = node.get(1);
    }
}
