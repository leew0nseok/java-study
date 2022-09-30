//StringBuffer 사용
public class ExStringBuffer {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Java");
        String result = sb.toString();
        System.out.println(result);

        //위 코드를 String자료형만 이용
        String str = "";
        str += "Hello";
        str += " ";
        str += "Java";
        System.out.println(str);

        /*
        결과값은 같지만 내부적으로 객체가 생성되고 메모리가 사용되는 과정은 다르다.
        첫번 째 예제의 경우 StringBuffer 객체는 한번만 생성,
        두번 째 예제는 String 자료형에 +연산이 있을 때마다 새로운 String 객체가 생성
        --> 총 4개의 String 자료형 객체가 생성됨.

        String 자료형은 한번 값이 생성되면 그 값을 변경할 수 없다.(immutable)
        StringBuffer (mutable) --> 언제든 수정 가능

        StringBuffer자료형은 String자료형보다 무겁다.
        따라서 문자열 추가나 변경등의 작업이 많을 경우 StringBuffer,
        문자열 변경 작업이 거의 없는 경우 String을 사용하는 것이 유리.
         */

        StringBuffer sb1 = new StringBuffer();
        sb1.append("java");
        sb1.insert(0, "hello"); //insert메소드
        System.out.println(sb1.toString());

        System.out.println(sb1.substring(0,4)); //hell 출력

    }
}
