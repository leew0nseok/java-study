//����������

import java.util.Scanner;
import java.util.Random;

public class rsp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("����(0), ����(1), ��(2): ");
        int user = sc.nextInt();
        Random ran = new Random();
        int computer = ran.nextInt(3);

        if (user == computer){
            System.out.println("�����ϴ�");
        }
        else if ((user == 1 && computer == 0) || (user == 2 && computer == 1) || (user == 0 && computer == 2)){
            System.out.println("���� �¸�");
        }
        else if ((user == 0 && computer == 1) || (user == 1 && computer == 2) || (user == 2 && computer == 0)){
            System.out.println("��ǻ�� �¸�");
        }
        sc.close();
    }
}
