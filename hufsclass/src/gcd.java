//�ִ� �����
import java.util.Scanner;

public class gcd {
    public static void main(String[] agrs){
        int x, y, r;

        System.out.println("�ΰ��� ������ �Է��Ͻÿ�(ū��, ������): ");
        Scanner scan = new Scanner(System.in);

        x = scan.nextInt();
        y = scan.nextInt();

        while(y !=0){
            r = x % y;
            x = y;
            y = r;
        }

        System.out.println("�ִ� ������� " + x);

        scan.close();

    }
}
