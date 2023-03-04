import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class IteratorEx {
    public static void main(String[] args){
        List<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);

        Iterator<Integer> iterator = v.iterator();
        int sum = 0;
        while(iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);
            sum += i;
        }
        System.out.println("벡터에 있는 정수 합: "+sum);
    }
}
