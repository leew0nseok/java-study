import java.awt.*;

public class AnnoymousRunnalbeTimer {
    public static void main(String[] args){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int i =0;
                while(true){
                    System.out.println(i);
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){

                    }
                    i++;
                }
            }
        };
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
