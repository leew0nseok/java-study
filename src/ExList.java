import java.util.ArrayList;
import java.util.Comparator;

public class ExList {
    public static void main(String args[]){
        //리스트는 배열과 달리 크기가 정해져 있지 않고 동적으로 변함
        //리스트사용을 위해 import java.util.ArrayList;를 import 해줘야함

        ArrayList pitches = new ArrayList();
        //ArrayList<String> pitches = new ArrayList<>(); 제네릭스(Generics)
        //<String> 이라는 제네릭스 표현식은 "ArrayList 안에 담을 수 있는 자료형은 String 타입 뿐이다" 라는 것을 의미한다.
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        pitches.add(0, "133"); // 첫번째 위치에 133 삽입.
        pitches.add(1, "150"); // 두번째 위치에 삽입

        System.out.println(pitches.get(1)); // 두번째 값 출력
        System.out.println(pitches.size()); // list에 담긴 갯수출력
        System.out.println(pitches.contains("142")); //true

        System.out.println(pitches.remove("129")); //remove(객체)의 경우는 리스트에서 객체에 해당되는 항목을 삭제하고 삭제한 결과(true, false)를 리턴
        System.out.println(pitches.remove("178")); //false
        System.out.println(pitches.remove(0)); // remove(인덱스)의 경우는 해당 인덱스의 항목을 삭제하고 삭제된 항목을 리턴

        pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(pitches);
    }
}
