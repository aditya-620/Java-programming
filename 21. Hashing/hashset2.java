import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashset2 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        // HashSet is used to store unique elements in no particular order
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Chennai");
        System.out.println(cities);

        LinkedHashSet<String> linkedCities = new LinkedHashSet<>();
        // LinkedHashSet is used to maintain insertion order
        linkedCities.add("Delhi");
        linkedCities.add("Mumbai");
        linkedCities.add("Bangalore");
        linkedCities.add("Chennai");
        System.out.println(linkedCities);

        TreeSet<String> treeCities = new TreeSet<>();
        // TreeSet is used to store elements in sorted order
        treeCities.add("Delhi");
        treeCities.add("Mumbai");
        treeCities.add("Bangalore");
        treeCities.add("Chennai");
        System.out.println(treeCities);
    }
}
