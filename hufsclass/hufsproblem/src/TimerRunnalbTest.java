import javax.tools.Tool;
import java.awt.*;

public class TimerRunnalbTest {
    public static void main(String[] args){
        Runnable task = new TimerRunnable();
        Thread th = new Thread(task);

        th.start();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        while(true){
            toolkit.beep();
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }
}
