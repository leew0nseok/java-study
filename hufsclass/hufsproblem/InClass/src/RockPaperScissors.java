import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("����(0), ����(1), ��(2): ");
        int user = sc.nextInt();
        Random ran = new Random();
        int computer = ran.nextInt(3);

        if (user == 0) {
            if (computer == 0)
                System.out.print("�ΰ�: " + user + " ��ǻ��: " + computer + " �����ϴ�.");
            else if (computer == 1) {
                System.out.print("�ΰ�: " + user + " ��ǻ��: " + computer + " �ΰ� �¸�");
            } else {
                System.out.print("�ΰ�: " + user + " ��ǻ��: " + computer + " ��ǻ�� �¸�");
            }
        } else if (user == 1) {
            if (computer == 0)
                System.out.print("�ΰ�: " + user + " ��ǻ��: " + computer + " �ΰ� �¸�");
            else if (computer == 1) {
                System.out.print("�ΰ�: " + user + " ��ǻ��: " + computer + " �����ϴ�.");
            } else {
                System.out.print("�ΰ�: " + user + " ��ǻ��: " + computer + " ��ǻ�� �¸�");
            }
        } else {
            if (computer == 0)
                System.out.print("�ΰ�: " + user + " ��ǻ��: " + computer + " ��ǻ�� �¸�");
            else if (computer == 1) {
                System.out.print("�ΰ�: " + user + " ��ǻ��: " + computer + " �ΰ� �¸�");
            } else {
                System.out.print("�ΰ�: " + user + " ��ǻ��: " + computer + " �����ϴ�.");
            }
        }
    }
}
