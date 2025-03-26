import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(30);

        System.out.println(set);

        set.remove(20);
        if(set.contains(20)){
            System.out.println("contains 20");
        } else {
            System.out.println("does not contain 20");
            System.out.println(set);
        }

        System.out.println(set.size());
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
