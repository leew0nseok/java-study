import java.util.ArrayList;
import java.util.Comparator;

public class ExList {
    public static void main(String args[]){
        //����Ʈ�� �迭�� �޸� ũ�Ⱑ ������ ���� �ʰ� �������� ����
        //����Ʈ����� ���� import java.util.ArrayList;�� import �������

        ArrayList pitches = new ArrayList();
        //ArrayList<String> pitches = new ArrayList<>(); ���׸���(Generics)
        //<String> �̶�� ���׸��� ǥ������ "ArrayList �ȿ� ���� �� �ִ� �ڷ����� String Ÿ�� ���̴�" ��� ���� �ǹ��Ѵ�.
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        pitches.add(0, "133"); // ù��° ��ġ�� 133 ����.
        pitches.add(1, "150"); // �ι�° ��ġ�� ����

        System.out.println(pitches.get(1)); // �ι�° �� ���
        System.out.println(pitches.size()); // list�� ��� �������
        System.out.println(pitches.contains("142")); //true

        System.out.println(pitches.remove("129")); //remove(��ü)�� ���� ����Ʈ���� ��ü�� �ش�Ǵ� �׸��� �����ϰ� ������ ���(true, false)�� ����
        System.out.println(pitches.remove("178")); //false
        System.out.println(pitches.remove(0)); // remove(�ε���)�� ���� �ش� �ε����� �׸��� �����ϰ� ������ �׸��� ����

        pitches.sort(Comparator.naturalOrder());  // ������������ ����
        System.out.println(pitches);
    }
}
