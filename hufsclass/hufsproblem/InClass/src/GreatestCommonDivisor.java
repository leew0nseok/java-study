import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        int x, y, r;

        System.out.println("�ΰ��� ������ �Է��Ͻÿ�(ū��, ������): ");
        Scanner scan = new Scanner(System.in);

        x = scan.nextInt();
        y = scan.nextInt();

        while(x != 0 && y != 0){
            if(x>y){
                x = x - y;
            }
            else y = y - x;
        }
        System.out.println("�ִ� ������� " + x);
    }
}
