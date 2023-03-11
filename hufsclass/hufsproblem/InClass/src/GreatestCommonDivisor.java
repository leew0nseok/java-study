import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        int x, y, r;

        System.out.println("두개의 정수를 입력하시오(큰수, 작은수): ");
        Scanner scan = new Scanner(System.in);

        x = scan.nextInt();
        y = scan.nextInt();

        while(x != 0 && y != 0){
            if(x>y){
                x = x - y;
            }
            else y = y - x;
        }
        System.out.println("최대 공약수는 " + x);
    }
}
