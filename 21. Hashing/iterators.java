import java.util.HashSet;
import java.util.Iterator;

public class iterators {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Chennai");

        //iteration on set using iterator interface
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------------");

        //iteration on set using enhanced for loop
        for(String city : cities){
            System.out.println(city);
        }
        System.out.println("-----------------");
        
        //iteration on set using forEach method
        cities.forEach(city -> {
            System.out.println(city);
        });
    }
}
