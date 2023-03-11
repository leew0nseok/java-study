public class FlyingCar implements Drivable, Flyable{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
    public void drive() {
        System.out.println("I'm driving");
    }
}
