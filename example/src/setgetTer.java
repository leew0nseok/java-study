import java.io.PrintStream;
import java.util.Scanner;

public class setgetTer {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        Hufs var2 = new Hufs();
        System.out.print("�б� �̸��� �Է��Ͻÿ�: ");
        String var3 = var1.nextLine();
        System.out.print("�й��� �Է��Ͻÿ�: ");
        int var4 = var1.nextInt();
        var2.setNameUniv(var3);
        var2.setStudentID(var4);
        System.out.println();
        PrintStream var10000 = System.out;
        String var10001 = var2.getNameUniv();
        var10000.println("�б� �̸��� " + var10001 + ", �й��� " + var2.getStudentID() + "�Դϴ�.");
    }
}
