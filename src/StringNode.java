public class StringNode extends AbstractNodeBase{

    public String value;

    public StringNode(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value.replace("\"", "");
    }
}
