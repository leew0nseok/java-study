import java.util.Locale;

public class ExString {
    public static void main(String args[]){
        String a = "hello";
        String b = new String("hello");
        System.out.println(a.equals(b)); //문자열의 값을 비교하므로 true
        System.out.println(a == b); //a와 b는 서로 다른 객체이므로 false

        //indexOf, contains
        String c = "Hello Java";
        System.out.println(c.indexOf("Java"));
        System.out.println(c.indexOf("l"));
        System.out.println(c.contains("Hello")); //true
        System.out.println(c.contains("hello")); //false
        //charAt
        System.out.println(c.charAt(6)); //charAt는 문자열에서 특정 위치의 문자를 리턴 "J"출력
        //replaceAll
        System.out.println(c.replaceAll("Java", "World")); //Java를 World로 바꿔서 출력됨. 문자열 c가 바뀌는게 아님.
        //toUpperCase
        System.out.println(c.toUpperCase()); // HELLO JAVA 출력

        //split
        String d = "a:b:c:d";
        String[] result = d.split(":"); //result 는 {"a", "b", "c", "d"}
        for (int i =0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        //문자열 포매팅
        //숫자 바로 대입
        System.out.println(String.format("I eat %d apples.", 3));  // "I eat 3 apples." 출력
        //문자열 바로 대입
        System.out.println(String.format("I eat %s apples", "five")); // "I eat five apples." 출력
        //2개 이상의 값 넣기
        int number = 10;
        String day = "three";
        // "I ate 10 apples. so I was sick for three days." 출력
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));
        //System.out.printf는 String.format메소드 없이 포매팅 가능
        System.out.printf("I ate %d apples. so I was sick for %s days.", number, day);
        //String.format과 System.out.printf의 차이는 전자는 문자열을 리턴하는 메소드이고 후자는 문자열을 출력하는 메소드라는 점




   }
}
