import java.util.HashSet;

public class Distinct_ele {
    public static void main(String[] args) {

        int arr[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println("Distinct elements are: " + set.size());       
    }
}

//time complexity: O(n)