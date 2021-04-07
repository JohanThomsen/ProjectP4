import javax.lang.model.util.Types;
import java.lang.reflect.Type;

public class Symbol {
    Symbol HashForwards;
    Symbol HashBackwards;
    //Symbol Hash; //threads symbols whose names hash to the same value. In practice, such symbols are doubly linked to facilitate symbol deletion.
    String Name;
    String Type;
    Symbol Var; //wtf er det her ??? Side290
    Symbol Level; // threads symbols declared in the same scope. This field facilitates symbol deletion when a scope is abandoned.
    int Depth;

    public Symbol(String name, String type){
        Name = name;
        Type = type;
        HashForwards = null;
        HashBackwards = null;
        Var = null;
        Level = null;
    }

    public String fullToString(){
        return String.format("Name: " + Name + ", Type: " + Type + ", Var(" + Var + "), Backwards(" + HashBackwards + "), Forwards (" + HashForwards + ")," + " Depth:" + Depth);
    }

    @Override
    public String toString() {
        return String.format("Name: " + Name + ", Type: " + Type + ", Depth: " + Depth);
    }
}
