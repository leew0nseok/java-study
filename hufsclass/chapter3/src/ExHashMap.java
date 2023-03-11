import java.util.HashMap;
/*
"사람"을 예로 들면 누구든지 "이름" = "홍길동", "생일" = "몇 월 며칠" 등으로 구분할 수 있다.
자바의 맵(Map)은 이러한 대응관계를 쉽게 표현할 수 있게 해 주는 자료형이다.
이것은 요즘 나오는 대부분의 언어들도 갖고 있는 자료형으로 Associative array, Hash라고도 불린다.
 */
public class ExHashMap {
    public static void main(String args[]){
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");

        System.out.println(map.get("people"));  // "사람" 출력
        //get메소드를 사용하면 key에 대응하는 value값을 얻을 수 있다.

        //key에 해당하는 value가 없을 경우 null을 리턴한다.
        //null대신 디폴트 값을 얻고 싶은 경우엔 getOrDefault사용
        System.out.println(map.getOrDefault("java", "자바"));  // "자바" 출력

        //Map에 해당 Key가 있는지 조사
        System.out.println(map.containsKey("people"));  // true 출력

        //key에 해당되는 아이템(key, value)을 삭제함
        System.out.println(map.remove("people"));  // "사람" 출력

        System.out.println(map.containsKey("people"));  // false 출력

        //Map의 갯수를 리턴
        System.out.println(map.size());  // 1 출력

        //keySet은 Map의 모든 key를 모아서 리턴함.
        map.put("dog", "개");
        System.out.println(map.keySet());  // [baseball, dog] 출력
        //keySet() 메소드는 Map의 모든 Key를 모아서 Set 자료형으로 리턴

    }
}
