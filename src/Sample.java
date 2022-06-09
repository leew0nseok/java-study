import java.util.ArrayList;
import java.util.HashMap;
public class Sample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);

        //Array
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        for (int i=0; i<weeks.length; i++) {
            System.out.println(weeks[i]);
        }

        //List
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        //HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
    }
}