import java.util.*;

public class HashMapDicEx {
    public static void main(String[] args){
        Map<String, String> dic = new HashMap<>();

        dic.put("baby", "�Ʊ�");
        dic.put("love", "���");
        dic.put("apple", "���");

        Set<String> set = dic.keySet();
        Iterator<String> iterator = set.iterator();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("ã�� ���� �ܾ��?");
            String word = scanner.next();
            if(dic.get(word) != null)
                System.out.println(dic.get(word));
            else if(dic.get(word).equals("exit")){
                break;
            }
            else{
                System.out.println("���� �ܾ� �Դϴ�.");
            }

        }
        System.out.println("�����մϴ�.");
    }
}
