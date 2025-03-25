import java.util.*;
public class LinkedHm_TreeHm {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        TreeMap<String, Integer> thm = new TreeMap<>();
        HashMap<String, Integer> hm = new HashMap<>();


        lhm.put("India",50);
        lhm.put("China", 100);
        lhm.put("nepla", 70);

        thm.put("India",50);
        thm.put("China", 100);
        thm.put("nepla", 70);

        hm.put("India",50);
        hm.put("China", 100);
        hm.put("nepla", 70);

        System.out.println(lhm);   //print in order, as inserted
        System.out.println(thm);   //sorted based on key
        System.out.println(hm);   //random order
    } 
}
