public class chap4Qz {
    public static void main(String[] args) {
        //Q1 다음 코드의 출력결과는?
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }
        /*
        everywhere
         */

        //Q2
        int i = 1;
        int result = 0;
        while(i < 1000){
            if (i % 3 == 0)
                result += i;
            i++;
        }
        System.out.println(result);

        //Q3
        for(int j = 1; j < 6; j++){
            for(int x = 1; x < j+1; x++)
                System.out.print("*");
            System.out.println(" ");
        }

        //Q4
        for(int y = 1; y < 101; y++)
            System.out.println(y);

        //Q5
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum = 0;
        for(int mark : marks){
            sum += mark;
        }
        System.out.println(sum/marks.length);
    }
}
