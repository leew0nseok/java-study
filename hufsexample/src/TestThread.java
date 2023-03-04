import java.awt.*;

public class TestThread {
    public static void main(String[] args){
        Thread th = new TimerThread();
        th.start();

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        while(true){
            toolkit.beep();
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}
