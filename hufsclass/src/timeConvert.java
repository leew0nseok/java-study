//��, ��, �� ��ȯ
import java.util.Scanner;

public class timeConvert {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("������ �Է��ϼ���: ");
        int time = scanner.nextInt();

        int hour = (time / 60) / 60;
        int minute = (time / 60) % 60;
        int second = time % 60;

        System.out.println(time + "�ʴ� " + hour + "�ð�, " + minute +"��, " + second + "���Դϴ�.");
    }
}
