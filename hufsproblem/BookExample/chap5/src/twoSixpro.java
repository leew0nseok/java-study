import java.util.Scanner;

public class twoSixpro {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;

        Scanner scanner = new Scanner(System.in);
        char c = scanner.nexstring
        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = Integer.parseInt(scanner.nextLine());

            if (selectNo == 1) {
                System.out.print("학생수> ");
                studentNum = Integer.parseInt(scanner.nextLine());
                scores = new int[studentNum];

            }
            else if(selectNo ==2){
                for(int i =0; i < studentNum; i++){
                    System.out.print("score[" + i + "]> ");
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }
            }
            else if(selectNo ==3){
                for(int i =0; i < studentNum; i++){
                    System.out.println("score[" + i + "]> "+ scores[i]);
                }

            }
            else if(selectNo ==4){
                int max = scores[0];
                int sum = 0;
                for(int i =0; i < studentNum; i++){
                    max = max < scores[i]? scores[i] : max;
                    sum += scores[i];
                }
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + (double)sum/(double)studentNum);

            }
            else if(selectNo ==5){
                run = false;

            }

        }
        System.out.println("프로그램 종료");
    }
}
