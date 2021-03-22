import javax.naming.Name;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.function.Function;

public class SymbolTable {
    Hashtable<String, Symbol> Table = new Hashtable<>();
    //ArrayList<Symbol> ScopeDisplay = new ArrayList<>();
    //Hashtable<Integer, Symbol> ScopeDisplay = new Hashtable<>();
    Symbol[] ScopeDisplay = {null, null, null, null, null, null, null, null, null,};
    protected int Depth = 0;

    public void openScope(){
        Depth++;
        ScopeDisplay[Depth] = null;
    }
    
    public void closeScope(){
        Symbol currentSym;
        Symbol nextSym = ScopeDisplay[Depth];
        Symbol prevSym = null;
        while (nextSym != null) {
            currentSym = nextSym;
            nextSym = currentSym.Level;

            prevSym = currentSym.Var;
            Delete(currentSym);

            if (prevSym != null){
                Add(prevSym);
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
            Add(newsym);
        } else {
            Delete(oldsym);
            Add(newsym);
        }
    }
    //adding to scopedisplays
    private Symbol addToScopeDisplay(String name, String type) {
        Symbol newsym;
        newsym = new Symbol(name, type);
        if (ScopeDisplay[Depth] != null){
            newsym.Level = ScopeDisplay[Depth];
        }
        newsym.Depth = Depth;
        ScopeDisplay[Depth] = newsym;
        return newsym;
    }

    private void Add(Symbol sym){
        Symbol oldsym = Table.get(sym.Name);
        if (oldsym == null){
            Table.put(sym.Name, sym);
        } else {
            Symbol next = oldsym;
            while (next != null){
                oldsym = next;
                next = next.HashForwards;
            }
            sym.HashBackwards = oldsym;
            oldsym.HashForwards = sym;
        }
    }
    private void Delete(Symbol sym){
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

    public ArrayList<Symbol> getAllEntries(){
        ArrayList<Symbol> list = new ArrayList<>();
        Table.forEach((name, sym) -> {
            list.add(sym);
        });
        return list;
    }
}
