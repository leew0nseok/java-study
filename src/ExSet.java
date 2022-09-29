import java.util.Arrays;
import java.util.HashSet;
/*
집합자료형의 특징은 중복을 허용하지 않는다.
순서가 없다.
 */
public class ExSet {
    public static void main(String args[]){
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] 출력

        //교집합, 합집합, 차집합 구하기
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);  // 교집합 수행
        System.out.println(intersection);  // [4, 5, 6] 출력

        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력

        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);  // [1, 2, 3] 출력

        //집합에 값을 추가
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, Jump, H, e, l, o] 출력

        //값 여러 개 추가
        set.addAll(Arrays.asList("Ja", "va"));
        System.out.println(set);

        set.remove("To");
        set.removeAll(Arrays.asList("Ja", "va"));
        System.out.println(set);
    }
}
