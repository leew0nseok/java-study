public class multiArray {
    public static void main(String[] args){
        int Array[][] = {{10, 11, 12}, {20, 21}, {30, 31, 32}, {40, 41}};

        for(int i = 0; i < Array.length; i++){
            for(int j = 0; j < Array[i].length; j++) {
                System.out.print(Array[i][j]+ " ");
            }
            System.out.println( );
            }
    }
}
