import java.util.Arrays;
import java.util.HashSet;
/*
�����ڷ����� Ư¡�� �ߺ��� ������� �ʴ´�.
������ ����.
 */
public class ExSet {
    public static void main(String args[]){
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] ���

        //������, ������, ������ ���ϱ�
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1);  // s1���� intersection ����
        intersection.retainAll(s2);  // ������ ����
        System.out.println(intersection);  // [4, 5, 6] ���

        HashSet<Integer> union = new HashSet<>(s1);  // s1���� union ����
        union.addAll(s2); // ������ ����
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] ���

        HashSet<Integer> substract = new HashSet<>(s1);  // s1���� substract ����
        substract.removeAll(s2); // ������ ����
        System.out.println(substract);  // [1, 2, 3] ���

        //���տ� ���� �߰�
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, Jump, H, e, l, o] ���

        //�� ���� �� �߰�
        set.addAll(Arrays.asList("Ja", "va"));
        System.out.println(set);

        set.remove("To");
        set.removeAll(Arrays.asList("Ja", "va"));
        System.out.println(set);
    }
}
