import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDicEx {
    public static void main(String[] args){
        Map<String, String> dic = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");


        while(true){
            System.out.println("찾고 싶은 단어는?");
            String word = scanner.next();

            if(dic.get(word) != null ){
                System.out.println(dic.get(word));
            }
            else if(word.equals("exit") ){
                System.out.println("종료합니다...");
                break;
            }
            else{
                System.out.println(word + "는 없는 단어 입니다.");
            }
        }
    }
}
