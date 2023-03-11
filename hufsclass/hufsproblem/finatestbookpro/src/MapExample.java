import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<String> keyset = map.keySet();
        Iterator<String> keyIterator = keyset.iterator();
        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer scor = map.get(key);
            if(scor >= maxScore) {
                maxScore = scor;
                name = key;
            }
            totalScore += scor;
        }
        System.out.println("평균점수" + totalScore/map.size());
        System.out.println("최고점수 "+ maxScore);
        System.out.println("최고점수 아이디" + name);
    }
}
