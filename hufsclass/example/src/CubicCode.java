public class CubicCode {
    public static void main(String[] var0) {
        Cubic[] cubic = new Cubic[6];

        for(int i = 0; i < cubic.length; ++i) {
            cubic[i] = new Cubic(i);
            cubic[i].setLine(cubic[i].getS());
            System.out.println("Cubic[" + (i + 1) + "] ¸éÀûÀº " + cubic[i].getLine());
        }

    }
}
