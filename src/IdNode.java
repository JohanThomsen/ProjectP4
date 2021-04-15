public class IdNode extends AbstractNodeBase{

    public String value;

    public IdNode(String value) {
        this.value = value.replace("[", "").replace("]","");
    } //TODO This shoudlnt be necessary
}
