public class ChangeCondition {
    public static void main(String[] var0) {
        char var1 = (char)((int)(Math.random() * 4.0) + 97);
        switch (var1) {
            case 'a':
                System.out.println("a 입니다");
                break;
            case 'b':
                System.out.println("b 입니다");
                break;
            case 'c':
                System.out.println("c 입니다");
                break;
            default:
                System.out.println("d 입니다");
        }

    }
}
