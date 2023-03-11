import java.util.Scanner;

public class LeibnizFormula {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double bunja = 4.0;
        double bunmo = 1.0;
        double sum = 0.0;
        int loop_count = scan.nextInt();
        while(loop_count > 0){
            sum = sum + bunja/bunmo;
            bunja *= -1.0;
            bunmo += 2.0;
            loop_count--;
        }
        System.out.println("Pi = " + sum);
        scan.close();
    }
}
