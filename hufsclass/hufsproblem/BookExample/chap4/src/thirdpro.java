public class thirdpro {
    public static void main(String[] args){
        int x, y;
        while(true){
            x = (int)(Math.random()*6)+1;
            y = (int)(Math.random()*6)+1;
            if(x+y == 5){
                System.out.printf("ÁÖ»çÀ§ ´« : %d, %d", x, y);
                break;
            }
        }
    }
}
