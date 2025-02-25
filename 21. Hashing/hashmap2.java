import java.util.HashMap;
import java.util.Set;
public class hashmap2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 135);
        map.put("China", 200);  
        map.put("USA", 100);
        map.put("nepal", 50);
        map.put("Indonesia", 140);

        //iterate over the keys
        Set<String> keys = map.keySet();  //O(n)
        System.out.println(keys); // [India, China, USA, nepal, Indonesia]
        //A set is a collection that contains no duplicate elements.

        //for each loop
        for(String k : keys){
            System.out.println("key: " + k + ", value: " + map.get(k));
        }
    }
}
