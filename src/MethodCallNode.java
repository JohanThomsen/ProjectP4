public class MethodCallNode extends AbstractNodeBase{
    // TODO: 22-03-2021 Fill this with stuff
    IdNode Left;
    IdNode Right;

    public MethodCallNode(IdNode left, IdNode right){
        this.Left = left;
        this.Right = right;
    }
}
