import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int time = scanner.nextInt();

        System.out.println(time +"초는 " + (time / (60 * 60)) + "시간" + (time % (60 * 60))/60 + "분" + (time % (60 * 60))%60 +"초입니다." );
    }
}
