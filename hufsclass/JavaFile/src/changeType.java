public class changeType {
    public static void main(String args[]) {
        //���ڿ��� ����������
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);  // 123 ���

        //�������� ����������1
        int x = 123;
        String numm = "" + x;
        System.out.println(numm); //123���

        //�������� ����������2
        int y = 123;
        String num1 = String.valueOf(y);
        String num2 = Integer.toString(y);
        System.out.println(num1);  // 123 ���
        System.out.println(num2);  // 123 ���

        //�Ҽ����� ���Ե� ���ڿ�
        String numd = "123.456";
        double d = Double.parseDouble(numd);
        System.out.println(d);

        int n1 = 123;
        double d1 = n1;  // ������ �Ǽ��� �ٲܶ����� ĳ������ �ʿ����.
        System.out.println(d1);  // 123.0 ���

        double d2 = 123.456;
        int n2 = (int) d2; // �Ǽ��� ������ �ٲܶ����� �ݵ�� ���������� ĳ������ �־�� �Ѵ�.
        System.out.println(n2);  // �Ҽ����� ������ 123 ���

        /*
        String num = "123.456";
        int n = Integer.parseInt(num);  // �Ǽ� ������ ���ڿ��� ������ ��ȯ�� ��� NumberFormatException�� �߻��Ѵ�.
         */
    }
}
