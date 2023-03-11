public class nArray {
    public static void main(String[] var0) throws Exception {
        int[][] intArray = new int[][]{{87, 69}, {92, 96, 80}, {95, 80}};

        for(int i = 0; i < intArray.length; ++i) {
            for(int j = 0; j < intArray[i].length; ++j) {
                System.out.println("Scores[" + i + "][" + j + "]=" + intArray[i][j]);
            }
        }

    }
}
