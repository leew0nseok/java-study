import java.util.Scanner;

public class practice {
    public static void main(String[] var0) throws Exception {
        int[][] cubic = new int[][]{{87, 69}, {92, 96, 80}, {95, 80}};

        for(int i = 0; i < cubic.length; ++i) {
            for(int f = 0; f < cubic[i].length; ++f) {
                System.out.println("Scores[" + i + "][" + f + "]=" + cubic[i][f]);
            }
        }

    }
}
