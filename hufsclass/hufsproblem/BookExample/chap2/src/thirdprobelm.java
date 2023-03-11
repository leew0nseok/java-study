import java.util.Scanner;

public class thirdprobelm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. 이름: ");
        String name = scanner.nextLine();
        System.out.println("2. 주민번호 앞 6자리: ");
        String num = scanner.nextLine();
        System.out.println("3. 전화번호: ");
        String tel = scanner.nextLine();

        System.out.printf("이름: %s, 주민번호 앞 6자리 : %s, 전화번호: %s", name, num, tel);
    }
}
