public class PDA implements MobilePhoneInterface, MP3Interface{
    public int calculate(int x, int y){
        return x+y;
    }
    public void manage(){
        System.out.println("������ �����մϴ�.");
    }
    @Override
    public void receiveCall() {
        System.out.println("������������~~");
    }

    @Override
    public void receiveSMS() {
        System.out.println("���ڿԾ��.");
    }

    @Override
    public void play() {
        System.out.println("���� �����մϴ�.");
    }

    @Override
    public void stop() {
        System.out.println("������ ���ϴ�.");
    }

    @Override
    public void sendCall() {
        System.out.println("��ȭ�� �̴ϴ�");
    }

    @Override
    public void sendSMS() {
        System.out.println("���ڸ� �����ϴ�.");
    }
}
