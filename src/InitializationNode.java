public class InitializationNode extends AbstractNodeBase{
    public IdNode Type;
    public IdNode Identifier;

    public InitializationNode(){

    }
    public InitializationNode(IdNode type, IdNode identifier){
        Type = type;
        Identifier = identifier;
    }
}
