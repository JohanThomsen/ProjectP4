import java.util.ArrayList;
import java.util.Hashtable;

public class SymbolTable {
    Hashtable<String, Symbol> Table;
    ArrayList<Symbol> ScopeDisplay;
    protected int Depth;

    public SymbolTable(){
        Table = new Hashtable<>();
        ScopeDisplay = new ArrayList<>();
        Depth = 0;
        ScopeDisplay.add(Depth, null);
    }

    public void openScope(){
        Depth++;
        if (ScopeDisplay.size() > Depth) {
            ScopeDisplay.set(Depth, null);
        }
        ScopeDisplay.add(Depth, null);
    }
    
    public void closeScope(){
        Symbol currentSym;
        Symbol nextSym = ScopeDisplay.get(Depth);
        Symbol prevSym = null;
        while (nextSym != null) {
            currentSym = nextSym;
            nextSym = currentSym.Level;

            prevSym = currentSym.Var;
            delete(currentSym);

            if (prevSym != null){
                add(prevSym);
            }
        }
        Depth--;
    }

    public Symbol retrieveSymbol(String name){
        Symbol sym = Table.get(name);
        while (sym != null){
            if (sym.Name.equals(name)){
                return sym;
            }
            sym = sym.HashForwards;
        }
        return null;
    }

    public void enterSymbol(String name, String type){
        Symbol newsym = null;
        Symbol oldsym = retrieveSymbol(name);
        //Checking for duplicate
        if (oldsym != null){
            if (oldsym.Depth == Depth) {
                System.out.println("Duplicate definition of " + name);
                return;
                //TODO lav noget exception arbejde istedet for bare at returne
            } else {
                newsym = addToScopeDisplay(name, type);
            }
        } else {
            newsym = addToScopeDisplay(name, type);
        }
        addToHashTable(newsym, oldsym);
        newsym.Var = oldsym;
    }

    //Adding to Hash Table
    private void addToHashTable(Symbol newsym, Symbol oldsym) {
        if (oldsym == null){
            add(newsym);
        } else {
            delete(oldsym);
            add(newsym);
        }
    }

    //Adding to the level linked list via the scope display.
    private Symbol addToScopeDisplay(String name, String type) {
        Symbol newsym;
        newsym = new Symbol(name, type);
        if (ScopeDisplay.get(Depth) != null){
            newsym.Level = ScopeDisplay.get(Depth);
        }
        newsym.Depth = Depth;
        ScopeDisplay.set(Depth, newsym);
        return newsym;
    }

    private void add(Symbol sym){
        Symbol oldsym = Table.get(sym.Name);
        //Check for collision
        if (oldsym == null){
            Table.put(sym.Name, sym);
        } else {
            //Handle Collision with linked list
            Symbol next = oldsym;
            while (next != null){
                oldsym = next;
                next = next.HashForwards;
            }
            sym.HashBackwards = oldsym;
            oldsym.HashForwards = sym;
        }
    }
    //Remove symbol from hashtable and collision chain
    private void delete(Symbol sym){
        Symbol Backward = null;
        Symbol Forward = null;
        if (sym.HashForwards != null) {
            Forward = retrieveSymbol(sym.HashForwards.Name);
        }
        if (sym.HashBackwards != null) {
            Backward = retrieveSymbol(sym.HashBackwards.Name);
        }


        if (Forward != null && Backward != null) {
            Forward.HashBackwards = Backward;
            Backward.HashForwards = Forward;
        } else if (Backward != null) {
            Backward.HashForwards = null;
        }
        Table.remove(sym.Name, sym);
    }

    public void printCurrentScope(){
        System.out.println("------------Scope " + Depth + " Entries------------");
        Table.forEach((name, sym) -> {
            System.out.println(sym);
        });
    }
}
