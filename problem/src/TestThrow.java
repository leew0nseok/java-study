import java.io.IOException;

public class TestThrow {
    public static void main(String[] args){
        try {
            System.out.println(readString());
        }
        catch(IOException e){

        }
    }
    public static String readString() throws IOException {
        byte[] buf = new byte[100];
        System.out.println("���ڿ��� �Է��Ͻÿ�.");
        System.in.read(buf);
        return new String(buf);
    }
}
