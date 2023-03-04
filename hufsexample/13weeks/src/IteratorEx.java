import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class IteratorEx {
    public static void main(String[] args){

        List<Integer> v = new Vector<>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2,100);


        int sum = 0;

        Iterator<Integer> iterator = v.iterator();
        while(iterator.hasNext()){
            int n = iterator.next();
            System.out.println(n);
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합: " + sum);

    }
}
