

public class Method {
    int sum(int a, int b){
        return a+b;
    }

    String summ(String a, String b){
        return a+b;
    }

    int i = 1;

    void intPlus(){
        this.i++;
    }

    public static void main(String[] args){
        int a = 3;
        int b = 4;


        Method method = new Method();
        int c = method.sum(a, b);

        System.out.println(c);

        String x = "Hello";
        String y = "Java";

        String s = method.summ(x, y);

        System.out.println(s);

        System.out.println(method.i);
        method.intPlus();
        System.out.println(method.i);


    }
}
