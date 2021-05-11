public class Incrementer {
    int ID = -1;

    public int GetNextID(){
        ID++;
        return ID;
    }
    public Incrementer(int startValue){
        ID = startValue;
    }
    public Incrementer(){

    }
}
