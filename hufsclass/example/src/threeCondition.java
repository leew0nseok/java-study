public class threeCondition {
    public static void main(String[] var0) {
        int[] intArray = new int[]{66, 80, 84, 75, 86, 50, 90, 79, 89};
        int max = 0;

        for(int i = 0; i < intArray.length; ++i) {
            max = max < intArray[i] ? intArray[i] : max;
        }

        System.out.println("값 중에서 가장 큰 값은 " + max + " 입니다.");
    }
}
