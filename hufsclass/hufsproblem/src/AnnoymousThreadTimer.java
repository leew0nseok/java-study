import java.awt.*;

public class AnnoymousThreadTimer {
    public static void main(String[] args){
        Thread th = new Thread(){
            @Override
            public void run() {
                int i = 0;
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
