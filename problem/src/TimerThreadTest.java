import java.awt.*;

public class TimerThreadTest {
    public static void main(String[] args){
        Thread th = new TimerThread();
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        th.start();

        while(true){
            toolkit.beep();
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}
