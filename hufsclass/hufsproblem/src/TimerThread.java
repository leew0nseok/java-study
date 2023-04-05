public class TimerThread extends Thread{
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
}
