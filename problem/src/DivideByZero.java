import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int dividend;
        int divisor;

        try {
            System.out.print("나뉨수를 입력핫오");
            dividend = scanner.nextInt();
            System.out.print("나눗수를 입력핫오");
            divisor = scanner.nextInt();
            System.out.println(dividend + "를" + "로 나누면 몫은" + dividend / divisor + "입니다");
            scanner.close();
        }
        catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
