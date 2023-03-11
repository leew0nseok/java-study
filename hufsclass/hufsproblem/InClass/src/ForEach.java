public class ForEach {
    public static void main(String[] args){
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        int i =1;
        for (String fruit :names)
        {
            System.out.print(i + "-"+ fruit+ " ");
            i++;
        }
    }
}
