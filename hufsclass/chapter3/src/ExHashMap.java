import java.util.HashMap;
/*
"���"�� ���� ��� �������� "�̸�" = "ȫ�浿", "����" = "�� �� ��ĥ" ������ ������ �� �ִ�.
�ڹ��� ��(Map)�� �̷��� �������踦 ���� ǥ���� �� �ְ� �� �ִ� �ڷ����̴�.
�̰��� ���� ������ ��κ��� ���鵵 ���� �ִ� �ڷ������� Associative array, Hash��� �Ҹ���.
 */
public class ExHashMap {
    public static void main(String args[]){
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "���");
        map.put("baseball", "�߱�");

        System.out.println(map.get("people"));  // "���" ���
        //get�޼ҵ带 ����ϸ� key�� �����ϴ� value���� ���� �� �ִ�.

        //key�� �ش��ϴ� value�� ���� ��� null�� �����Ѵ�.
        //null��� ����Ʈ ���� ��� ���� ��쿣 getOrDefault���
        System.out.println(map.getOrDefault("java", "�ڹ�"));  // "�ڹ�" ���

        //Map�� �ش� Key�� �ִ��� ����
        System.out.println(map.containsKey("people"));  // true ���

        //key�� �ش�Ǵ� ������(key, value)�� ������
        System.out.println(map.remove("people"));  // "���" ���

        System.out.println(map.containsKey("people"));  // false ���

        //Map�� ������ ����
        System.out.println(map.size());  // 1 ���

        //keySet�� Map�� ��� key�� ��Ƽ� ������.
        map.put("dog", "��");
        System.out.println(map.keySet());  // [baseball, dog] ���
        //keySet() �޼ҵ�� Map�� ��� Key�� ��Ƽ� Set �ڷ������� ����

    }
}
