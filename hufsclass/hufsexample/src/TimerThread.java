//public class TimerThread extends Thread{
//    int n =0;
//    @Override
//    public void run(){
//        while(true){
//            System.out.println(n);
//            n++;
//            try{
//                Thread.sleep(1000);
//
//            }
//            catch(InterruptedException e){
//                return;
//            }
//        }
//    }
//}
public class TimerThread implements Runnable{
    int n =0;
    @Override
    public void run(){
        while(true){
            System.out.println(n);
            n++;
            try{
                Thread.sleep(1000);

            }
            catch(InterruptedException e){
                return;
            }
        }
    }
}
