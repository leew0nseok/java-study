public class CircleCode {
    public static void main(String[] args){
        Circle javapizza = new Circle(10, "�ڹ�����");
        Circle javadonut = new Circle(2, "�ڹٵ���");

        System.out.println("������(" + javapizza.getRadius() +") : "+ javapizza.getName() + "�� ������ " + javapizza.getSize());
        System.out.println("������(" + javadonut.getRadius() +") : "+ javadonut.getName() + "�� ������ " + javadonut.getSize());

    }
}
