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
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("-----------------------------------------------------");
            System.out.print("����> ");

            int selectNo = Integer.parseInt(scanner.nextLine());

            if (selectNo == 1) {
                System.out.print("�л���> ");
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
                System.out.println("�ְ� ����: " + max);
                System.out.println("��� ����: " + (double)sum/(double)studentNum);

            }
            else if(selectNo ==5){
                run = false;

            }

        }
        System.out.println("���α׷� ����");
    }
}
