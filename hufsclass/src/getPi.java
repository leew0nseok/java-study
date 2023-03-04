//PI±¸ÇÏ±â
import java.util.Scanner;

public class getPi {
    public static void main(String[] args){
        double bunja, bunmo, sum;
        int loop_count;
        Scanner scanner = new Scanner(System.in);

        loop_count = scanner.nextInt();
        bunja = 4.0;
        bunmo = 1.0;
        sum = 0.0;
        while(loop_count > 0){
            sum = sum + bunja / bunmo;
            bunja *= -1;
            bunmo += 2;
            loop_count -= 1;
        }
        System.out.println("Pi = " + sum);


    }
}
