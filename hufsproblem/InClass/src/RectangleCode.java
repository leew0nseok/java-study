import java.util.Scanner;

public class RectangleCode {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();

        Scanner scan = new Scanner(System.in);
        rectangle.width = scan.nextInt();
        rectangle.height = scan.nextInt();
        System.out.println("�簢���� ������ "+ rectangle.getArea());
    }
}
