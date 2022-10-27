public class NonSquareArray {
    public static void main(String[] args){
        int[][] intArray = {{10, 11, 12},{20, 21}, {30,31,32},{40,41}};

        for(int i =0; i< intArray.length; i++){
            for(int j =0; j <intArray[i].length; j++){
                System.out.print(intArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
