import java.util.Scanner;

public class RectangleCode {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();

        Scanner scan = new Scanner(System.in);
        rectangle.width = scan.nextInt();
        rectangle.height = scan.nextInt();
        System.out.println("사각형의 면적은 "+ rectangle.getArea());
    }
}
