//StringBuffer ���
public class ExStringBuffer {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Java");
        String result = sb.toString();
        System.out.println(result);

        //�� �ڵ带 String�ڷ����� �̿�
        String str = "";
        str += "Hello";
        str += " ";
        str += "Java";
        System.out.println(str);

        /*
        ������� ������ ���������� ��ü�� �����ǰ� �޸𸮰� ���Ǵ� ������ �ٸ���.
        ù�� ° ������ ��� StringBuffer ��ü�� �ѹ��� ����,
        �ι� ° ������ String �ڷ����� +������ ���� ������ ���ο� String ��ü�� ����
        --> �� 4���� String �ڷ��� ��ü�� ������.

        String �ڷ����� �ѹ� ���� �����Ǹ� �� ���� ������ �� ����.(immutable)
        StringBuffer (mutable) --> ������ ���� ����

        StringBuffer�ڷ����� String�ڷ������� ���̴�.
        ���� ���ڿ� �߰��� ������� �۾��� ���� ��� StringBuffer,
        ���ڿ� ���� �۾��� ���� ���� ��� String�� ����ϴ� ���� ����.
         */

        StringBuffer sb1 = new StringBuffer();
        sb1.append("java");
        sb1.insert(0, "hello"); //insert�޼ҵ�
        System.out.println(sb1.toString());

        System.out.println(sb1.substring(0,4)); //hell ���

    }
}
