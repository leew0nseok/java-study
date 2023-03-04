import java.util.ArrayList;
import java.util.List;

public class GameCharacter {
    class GameItem{
        String name;
        int type;
        int price;

        int getPrice(){
            return this.price;
        }
        public String toString(){
            return this.name;
        }
    }
    ArrayList<GameItem> list = new ArrayList<>();
    void add(String name, int type, int price){

    }

    void print(){

    }
}
