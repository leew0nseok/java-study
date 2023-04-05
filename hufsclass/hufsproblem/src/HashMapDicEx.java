import java.util.*;

public class HashMapDicEx {
    public static void main(String[] args){
        Map<String, String> dic = new HashMap<>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        Set<String> set = dic.keySet();
        Iterator<String> iterator = set.iterator();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("찾고 싶은 단어는?");
            String word = scanner.next();
            if(dic.get(word) != null)
                System.out.println(dic.get(word));
            else if(dic.get(word).equals("exit")){
                break;
            }
            else{
                System.out.println("없는 단어 입니다.");
            }

        }
        System.out.println("종료합니다.");
    }
}
