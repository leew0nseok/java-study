//5-4 call by value

class Updater{
    //call by value
   /* void update(int count){
        count++;
    }*/
    void update(Counter counter) {
        counter.count++;
    }
}

class Counter{
    int count = 0;
}

public class callByValue {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
//        myUpdater.update(myCounter.count);
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }
}
