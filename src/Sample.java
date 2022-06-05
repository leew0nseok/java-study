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

        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        for (int i=0; i<weeks.length; i++) {
            System.out.println(weeks[i]);
        }
    }
}