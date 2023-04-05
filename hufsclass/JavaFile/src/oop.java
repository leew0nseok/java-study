class Calculator {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }

    int sub(int num){
        result -= num;
        return result;
    }
}

public class oop {
    public static void main(String[] args) {

        Calculator cal1 = new Calculator(); //Calculator 梓端1 持失
        Calculator cal2 = new Calculator(); //Calculator 梓端2 持失


        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));
        System.out.println(cal1.add(3));

        System.out.println(cal2.add(5));
        System.out.println(cal2.add(7));
        System.out.println(cal2.add(8));

        cal2.sub(17);

        System.out.println(cal2.result);
    }
}
