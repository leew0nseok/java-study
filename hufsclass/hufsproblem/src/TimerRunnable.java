public class TimerRunnable implements Runnable{
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
}
