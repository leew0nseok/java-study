import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("������ �Է��Ͻÿ�: ");
        int n = sc.nextInt();
        long f = 1L;
        int minus1 = 1;

/*
        do {
            f *= (long)minus1;
            ++minus1;
        } while(minus1 <= n);
*/
        for(int i = n; i > 0; i--){
            f *= i;
        }

        System.out.printf("%d!�� %d�̴�", n, f);
    }
}
