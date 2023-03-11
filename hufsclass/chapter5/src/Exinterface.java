interface Predator{
    String getFood();

}

class Animals {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animals implements Predator {
    public String getFood(){
        return "apple";
    }
}

class Lion extends Animals implements Predator {
    public String getFood(){
        return "banana";
    }
}

class ZooKeeper {
    void feed(Predator predator) {  // 호랑이가 오면 사과를 던져 준다.
        System.out.println("feed " +predator.getFood());
    }

}

public class Exinterface {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple 출력
        zooKeeper.feed(lion);  // feed banana 출력
    }
}
