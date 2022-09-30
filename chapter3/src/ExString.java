import java.util.Locale;

public class ExString {
    public static void main(String args[]){
        String a = "hello";
        String b = new String("hello");
        System.out.println(a.equals(b)); //���ڿ��� ���� ���ϹǷ� true
        System.out.println(a == b); //a�� b�� ���� �ٸ� ��ü�̹Ƿ� false

        //indexOf, contains
        String c = "Hello Java";
        System.out.println(c.indexOf("Java"));
        System.out.println(c.indexOf("l"));
        System.out.println(c.contains("Hello")); //true
        System.out.println(c.contains("hello")); //false
        //charAt
        System.out.println(c.charAt(6)); //charAt�� ���ڿ����� Ư�� ��ġ�� ���ڸ� ���� "J"���
        //replaceAll
        System.out.println(c.replaceAll("Java", "World")); //Java�� World�� �ٲ㼭 ��µ�. ���ڿ� c�� �ٲ�°� �ƴ�.
        //toUpperCase
        System.out.println(c.toUpperCase()); // HELLO JAVA ���

        //split
        String d = "a:b:c:d";
        String[] result = d.split(":"); //result �� {"a", "b", "c", "d"}
        for (int i =0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        //���ڿ� ������
        //���� �ٷ� ����
        System.out.println(String.format("I eat %d apples.", 3));  // "I eat 3 apples." ���
        //���ڿ� �ٷ� ����
        System.out.println(String.format("I eat %s apples", "five")); // "I eat five apples." ���
        //2�� �̻��� �� �ֱ�
        int number = 10;
        String day = "three";
        // "I ate 10 apples. so I was sick for three days." ���
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));
        //System.out.printf�� String.format�޼ҵ� ���� ������ ����
        System.out.printf("I ate %d apples. so I was sick for %s days.", number, day);
        //String.format�� System.out.printf�� ���̴� ���ڴ� ���ڿ��� �����ϴ� �޼ҵ��̰� ���ڴ� ���ڿ��� ����ϴ� �޼ҵ��� ��




   }
}
