import javax.tools.Tool;
import java.awt.*;

public class AnnoymousRunnableTimer {
    public static void main(String[] args){

        Thread thread = new Thread(new Runnable(){
            int n =0;

            @Override
            public void run() {
                while(true){
                    System.out.println(n);
                    try{
                        Thread.sleep(1000);

                    }
                    catch(Exception e){

                    }
                    n++;
                }
            }
        });

        thread.start();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
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
