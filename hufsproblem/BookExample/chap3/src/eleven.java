import java.util.Scanner;

public class eleven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("���̵�: ");
        String name = scanner.nextLine();
        System.out.print("�н�����: ");
        String strPassword = scanner.nextLine();
        int intPassword = Integer.parseInt(strPassword);

        if(name.equals("java")){
            if(intPassword == 12345){
                System.out.println("�α��� ����");
            }
            else{
                System.out.println("�α��� ����:�н����尡 Ʋ��");
            }
        }
        else{
            System.out.println("�α��� ����: ���̵� �������� ����");
        }
    }
}
