//파이구하기
import java.util.Scanner;

public class pie {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("반복횟수: ");
        int cnt = scanner.nextInt();
        int clk = 1;
        double pi = 0;
        for(double i =1.0; clk <= cnt; i+=2.0){
            if(clk % 2 == 0){
                pi -= (4/i);
            }
            else{
                pi += (4/i);
            }
            clk +=1;
        }
        System.out.println(pi);
    }
}
