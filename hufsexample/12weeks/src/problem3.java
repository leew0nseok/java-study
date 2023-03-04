import java.awt.*;

public class problem3 {
    public static void main(String[] args){
        Runnable task = new TimerRunnable();
        Thread thread = new Thread(task);
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        thread.start();

        while(true){
            toolkit.beep();
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }


    }
}
