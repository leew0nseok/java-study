public class AutoCar implements OperateCar{
    AutoCar(){};

    @Override
    public void start() {
        System.out.println("�ڵ����� ����մϴ�.");
    }

    @Override
    public void stop() {
        System.out.println("�ڵ����� �����մϴ�.");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("�ڵ����� �ӵ��� " + speed + "km/h�� �ٲߴϴ�.");
    }

    @Override
    public void turn(int degree) {
        System.out.println("�ڵ����� ������ " + degree + "�� ��ŭ �ٲߴϴ�.");
    }
}
