import java.util.Scanner;

public class array1 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        int intArray[] = new int[5];
        int max;

        System.out.println("��� 5���� �Է��ϼ���.");

        for(int i =0; i < intArray.length; i++){
            intArray[i] = scanner.nextInt();
        }
        max = intArray[0];
        for(int j =0; j < intArray.length; j++){
            if(max < intArray[j])
                max = intArray[j];
        }
        System.out.println("���� ū ���� " + max + "�Դϴ�.");
    }
}
