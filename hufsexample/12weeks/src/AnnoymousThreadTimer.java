import java.awt.*;
import java.util.spi.ToolProvider;

public class AnnoymousThreadTimer {

    public static void main(String[] args){

        Thread th = new Thread() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();

            public void run() {
                int n = 0;
                while (true) {
                    toolkit.beep();
                    System.out.println(n);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        return;
                    }
                    n++;
                }
            }


        };

        th.start();
    }
}
