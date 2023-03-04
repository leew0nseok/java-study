import java.util.*;

public class chap3Qz {

    enum CoffeeType{
        AMERICANO(3000),
        ICE_AMERICANO(4000),
        CAFE_LATTE(5000);


        private final int value;
        CoffeeType(int value) { this.value = value; }

        public int getValue() { return value; }
    };
    static void printCoffeePrice(CoffeeType type) {
        //Q10�� �ʿ��� �Լ�
        int price = type.getValue();
        System.out.println(String.format("������ %d�� �Դϴ�.", price));
    }

    public static void main(String[] args){
        //Q1
        int ���� = 80;
        int ���� = 75;
        int ���� = 55;

        System.out.println("��������� "+ (���� + ���� + ����)/3);

        //Q2
        int i = 13;
        if (i % 2 == 0) System.out.println(i + "�� ¦���Դϴ�.");
        else System.out.println(i + "�� Ȧ���Դϴ�.");

        //Q3
        String num = "881120-1068234";
        System.out.println(num.substring(0, 6));
        System.out.println(num.substring(7, 14));

        //Q4
        System.out.println(num.charAt(7));

        //Q5
        String a = "a:b:c:d";
        System.out.println(a.replaceAll(":", "#"));

        //Q6
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);

        //Q7
        ArrayList<String> myArr = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ",myArr);
        System.out.println(result);

        //Q8
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        System.out.println(grade.remove("B"));

        //Q9
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);

        //Q10
        CoffeeType coffee = CoffeeType.AMERICANO;
        CoffeeType coffee1 = CoffeeType.ICE_AMERICANO;
        CoffeeType coffee2 = CoffeeType.CAFE_LATTE;
        printCoffeePrice(coffee);
        printCoffeePrice(coffee1);
        printCoffeePrice(coffee2);

    }
}
