import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 3, 2, 9, 4};
        HashSet<Integer> set = new HashSet<>();

        //union
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println("Union: " + set.size());

        //print union elemets
        for (Integer element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("--------------------");

        
        //intersection
        set.clear(); // clear the set to reuse it for intersection

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        int count = 0;
        for(int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                //print intersection elemets
                System.out.print(arr2[i] + " ");
                set.remove(arr2[i]); // remove to avoid counting duplicates
            }
        }
        System.out.println();
        System.out.println("Intersection: " + count);
    }
}