import java.util.Scanner;

public class array1 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        int intArray[] = new int[5];
        int max;

        System.out.println("양수 5개를 입력하세요.");

        for(int i =0; i < intArray.length; i++){
            intArray[i] = scanner.nextInt();
        }
        max = intArray[0];
        for(int j =0; j < intArray.length; j++){
            if(max < intArray[j])
                max = intArray[j];
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
    }
}
