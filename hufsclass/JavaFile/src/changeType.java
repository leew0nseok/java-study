public class changeType {
    public static void main(String args[]) {
        //문자열을 정수형으로
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);  // 123 출력

        //정수형을 문자형으로1
        int x = 123;
        String numm = "" + x;
        System.out.println(numm); //123출력

        //정수형을 문자형으로2
        int y = 123;
        String num1 = String.valueOf(y);
        String num2 = Integer.toString(y);
        System.out.println(num1);  // 123 출력
        System.out.println(num2);  // 123 출력

        //소숫점이 포함된 문자열
        String numd = "123.456";
        double d = Double.parseDouble(numd);
        System.out.println(d);

        int n1 = 123;
        double d1 = n1;  // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
        System.out.println(d1);  // 123.0 출력

        double d2 = 123.456;
        int n2 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
        System.out.println(n2);  // 소숫점이 생략된 123 출력

        /*
        String num = "123.456";
        int n = Integer.parseInt(num);  // 실수 형태의 문자열을 정수로 변환할 경우 NumberFormatException이 발생한다.
         */
    }
}
