import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDicEx {
    public static void main(String[] args){
        Map<String, String> dic = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        dic.put("baby", "�Ʊ�");
        dic.put("love", "���");
        dic.put("apple", "���");


        while(true){
            System.out.println("ã�� ���� �ܾ��?");
            String word = scanner.next();

            if(dic.get(word) != null ){
                System.out.println(dic.get(word));
            }
            else if(word.equals("exit") ){
                System.out.println("�����մϴ�...");
                break;
            }
            else{
                System.out.println(word + "�� ���� �ܾ� �Դϴ�.");
            }
        }
    }
}
