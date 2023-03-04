public class improvedFormon {
    public static void main(String[] args){
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};

        for(int i =0; i < names.length; i++){
            System.out.println(i+1 + "-" + names[i]);
        }

        //향상된 for문
        int j = 0;
        for(String name : names){
            System.out.println(++j + "-" + name);
        }
    }
}
