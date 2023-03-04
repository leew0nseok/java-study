public class FlyingCar implements Drivable, Flyable {

    @Override
    public void drive() {
        System.out.println("I'm driving");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
