public class PDATest {
    public static void main(String[] args){
        PDA pda = new PDA();

        pda.receiveCall();
        pda.receiveSMS();
        pda.play();
        System.out.println("3�� 5�� ���ϸ� "+ pda.calculate(3, 5));
        pda.manage();
    }
}
