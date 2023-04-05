public class FlyingCar implements Flyable, Drivable{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void drive() {
        System.out.println("I'm driving");
    }
}
