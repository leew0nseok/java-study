class Printer{
    void println(int x){
        System.out.println(x);
    }
    void println(boolean b){
        System.out.println(b);
    }
    void println(double d){
        System.out.println(d);
    }
    void println(String s){
        System.out.println(s);
    }
}
public class fourfour {
    public static void main(String[] args){
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("ȫ�浿");
    }
}
