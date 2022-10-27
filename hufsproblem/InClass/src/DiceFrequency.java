import java.util.Random;

public class DiceFrequency {
    public static void main(String[] args){
        int dice = 6;
        int[] frequency = new int[6];

        Random ran = new Random();
        for(int i =0; i < 10000; i++){
            frequency[(int)ran.nextInt(dice)]++;
        }
        System.out.println("==============");
        System.out.println("¸éºóµµ");
        System.out.println("==============");
        for(int j =0; j < dice; j++){
            System.out.println(j + "-" + frequency[j]);
        }
    }
}
