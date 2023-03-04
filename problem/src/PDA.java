public class PDA implements MobilePhoneInterface, MP3Interface{
    public int calculate(int x, int y){
        return x+y;
    }
    public void manage(){
        System.out.println("일정을 관리합니다.");
    }
    @Override
    public void receiveCall() {
        System.out.println("따르릉따르릉~~");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자왔어요.");
    }

    @Override
    public void play() {
        System.out.println("음악 연주합니다.");
    }

    @Override
    public void stop() {
        System.out.println("음악을 끕니다.");
    }

    @Override
    public void sendCall() {
        System.out.println("전화를 겁니다");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자를 보냅니다.");
    }
}
