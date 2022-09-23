public class repeatmon {
    public static void main(String[] args){
        //for문을 이용한 숫자 합 출력
        int sum = 0;

        int i = 0;
        for(i=1; i <100; i++){
            sum += i;
        }
        System.out.println("1~" + (i-1) + "합: " + sum);

        //실수
        for(float x=0.1f; x<=1.0f; x+=0.1f){
            System.out.println(x);
        }
    
        //구구단 이중 for문
        for(int m =2; m <=9; m++){
            System.out.println("*** " + "단 ***");
            for(int n =1; n<=9; n++){
                System.out.println(m + " x " + n + " = " + (m*n));
            }
        }

    }
}

