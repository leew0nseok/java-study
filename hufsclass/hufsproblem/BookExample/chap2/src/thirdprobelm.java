import java.util.Scanner;

public class thirdprobelm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. �̸�: ");
        String name = scanner.nextLine();
        System.out.println("2. �ֹι�ȣ �� 6�ڸ�: ");
        String num = scanner.nextLine();
        System.out.println("3. ��ȭ��ȣ: ");
        String tel = scanner.nextLine();

        System.out.printf("�̸�: %s, �ֹι�ȣ �� 6�ڸ� : %s, ��ȭ��ȣ: %s", name, num, tel);
    }
}
