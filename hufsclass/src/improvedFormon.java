public class improvedFormon {
    public static void main(String[] args){
        String names[] = {"���", "��", "�ٳ���", "ü��", "����", "����"};

        for(int i =0; i < names.length; i++){
            System.out.println(i+1 + "-" + names[i]);
        }

        //���� for��
        int j = 0;
        for(String name : names){
            System.out.println(++j + "-" + name);
        }
    }
}
