import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int intArray[] = new int[5];

        System.out.println("��� 5���� �Է��ϼ���.");
        for(int i =0; i < 5; i++){
            intArray[i] = scanner.nextInt();
        }
        int maxNum = intArray[0];
        for(int i =1; i < 5; i++){
            if (maxNum < intArray[i]) maxNum = intArray[i];
        }
        System.out.println("���� ū���� " + maxNum +"�Դϴ�.");
    }
}
