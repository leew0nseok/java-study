import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("가위(0), 바위(1), 보(2): ");
        int user = sc.nextInt();
        Random ran = new Random();
        int computer = ran.nextInt(3);

        if (user == 0) {
            if (computer == 0)
                System.out.print("인간: " + user + " 컴퓨터: " + computer + " 비겼습니다.");
            else if (computer == 1) {
                System.out.print("인간: " + user + " 컴퓨터: " + computer + " 인간 승리");
            } else {
                System.out.print("인간: " + user + " 컴퓨터: " + computer + " 컴퓨터 승리");
            }
        } else if (user == 1) {
            if (computer == 0)
                System.out.print("인간: " + user + " 컴퓨터: " + computer + " 인간 승리");
            else if (computer == 1) {
                System.out.print("인간: " + user + " 컴퓨터: " + computer + " 비겼습니다.");
            } else {
                System.out.print("인간: " + user + " 컴퓨터: " + computer + " 컴퓨터 승리");
            }
        } else {
            if (computer == 0)
                System.out.print("인간: " + user + " 컴퓨터: " + computer + " 컴퓨터 승리");
            else if (computer == 1) {
                System.out.print("인간: " + user + " 컴퓨터: " + computer + " 인간 승리");
            } else {
                System.out.print("인간: " + user + " 컴퓨터: " + computer + " 비겼습니다.");
            }
        }
    }
}
