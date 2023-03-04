public class PDATest {
    public static void main(String[] args){
        PDA pda = new PDA();

        pda.receiveCall();
        pda.receiveSMS();
        pda.play();
        System.out.println("3과 5를 더하면 "+ pda.calculate(3, 5));
        pda.manage();
    }
}
