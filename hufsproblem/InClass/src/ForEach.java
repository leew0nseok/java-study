public class ForEach {
    public static void main(String[] args){
        String names[] = {"���", "��", "�ٳ���", "ü��", "����", "����"};
        int i =1;
        for (String fruit :names)
        {
            System.out.print(i + "-"+ fruit+ " ");
            i++;
        }
    }
}
