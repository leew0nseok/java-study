import java.util.ArrayList;

public class GameCharater {
    private class GameItem {
        String name;
        int type;
        int price;

        int getPrice() {	return price;	}

        @Override
        public String toString() {
            return "GameItem [name=" + name + ", type=" + type + ", price=" + price + "]";
        }
    }

    private ArrayList<GameItem> list = new ArrayList<>();

    public void add(String name, int type, int price) {
        GameItem item = new GameItem();
        item.name = name;
        item.type = type;
        item.price = price;
        list.add(item);
    }

    public void print() {
        int total = 0;
        for (GameItem item : list) {
            System.out.println(item);
            total += item.getPrice();
        }
        System.out.println(total);
    }
}

/*
import java.util.ArrayList;
import java.util.List;

public class GameCharater {
    List<GameItem> gameitem = new ArrayList<GameItem>();
    public void add(String name, int type, int price){
        GameItem items = new GameItem();
        items.name = name;
        items.type = type;
        items.price = price;
        gameitem.add(items);
    }
    public void print(){
        int sum = 0;
        for(int i =0; i < gameitem.size(); i++){
            GameItem gi = new GameItem();
            gi = gameitem.get(i);
            System.out.println("GameItem"+gi.toString());
            sum += gi.getPrice();
        }
        System.out.print(sum);
    }


    class GameItem{
        String name;
        int type;
        int price;

        int getPrice(){
            return this.price;

        }
        public String toString(){
            return "[name="+this.name +", type="+this.type +",price="+this.price+"]" ;
        }
    }
}
*/