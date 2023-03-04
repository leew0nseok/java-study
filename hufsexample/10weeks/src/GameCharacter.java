import java.util.ArrayList;

public class GameCharacter {
    String name;
    int type;
    int price;
    ArrayList<GameItem> list = new ArrayList<>();

    public void add(String name, int type, int price){
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public void print(){
        System.out.println(this.name);
    }
    class GameItem{

    }
}
