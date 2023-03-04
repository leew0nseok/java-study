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
    void feed(Predator predator) {  // ȣ���̰� ���� ����� ���� �ش�.
        System.out.println("feed " +predator.getFood());
    }

}

public class Exinterface {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple ���
        zooKeeper.feed(lion);  // feed banana ���
    }
}
