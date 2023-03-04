import java.awt.*;

public class TimerThread extends Thread{

    Toolkit toolkit = Toolkit.getDefaultToolkit();

    @Override
    public void run() {
        int n = 0;
        while(true){
            toolkit.beep();
            System.out.println(n);
            try {
                Thread.sleep(1000);
            }
            catch(Exception e){
                return;
            }
            n++;
        }
    }
}
