public class AutoCar implements OperateCar{

    int speed;
    int degree;

    @Override
    public void start(){
        System.out.println("�ڵ����� ����մϴ�");
    }

    @Override
    public void stop() {
        System.out.println("�ڵ����� �����մϴ�");
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("�ڵ����� �ӵ��� " + this.speed + "km/h�� �ٲߴϴ�.");
    }

    @Override
    public void turn(int degree) {
        this.degree = degree;
        System.out.println("�ڵ����� �ӵ��� " + degree + "km/h�� �ٲߴϴ�.");
    }
}
