import javax.swing.text.TabExpander;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SymbolTable Table = new SymbolTable();
        Symbol BookTitle = new Symbol("BookTitle", "string");
        Symbol PageNumber = new Symbol("PageNumber", "number");
        Symbol RoomName = new Symbol("RoomName", "string");
        Symbol RoomNameInner = new Symbol("RoomName", "string");

        Table.enterSymbol("RoomName", "string");
        Table.enterSymbol("WorldName", "string");
        Table.openScope();
        Table.enterSymbol("BookTitle", "string");
        Table.enterSymbol("PageNumber", "number");
        Table.enterSymbol("RoomName", "string");
        Symbol RetrievedRoom = Table.retrieveSymbol("RoomName");
        System.out.println(RetrievedRoom.fullToString());
        System.out.println(RetrievedRoom.fullToString());
        ArrayList<Symbol> allEntries = Table.getAllEntries();
        allEntries.forEach(System.out::println);

        //TODO Der er noget galt med hashingen.
    }
}
