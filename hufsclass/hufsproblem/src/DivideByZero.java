import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int dividend;
        int divisor;

        try {
            System.out.print("�������� �Է��ֿ�");
            dividend = scanner.nextInt();
            System.out.print("�������� �Է��ֿ�");
            divisor = scanner.nextInt();
            System.out.println(dividend + "��" + "�� ������ ����" + dividend / divisor + "�Դϴ�");
            scanner.close();
        }
        catch (ArithmeticException e){
            System.out.println("0���� ���� �� �����ϴ�.");
        }
    }
}
