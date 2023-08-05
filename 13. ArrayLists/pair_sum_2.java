//find if any pair in a sorted & rotated ArrayList has a target sum.
import java.util.ArrayList;

public class pair_sum_2 {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        //breaking point
        int bp = -1;
        int n = list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1;  //smallest value
        int rp = bp;   //largest value

        while(lp != rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case 2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % n;
            } else {
                //case 3 (list.get(lp) + list.get(rp) > target)
                rp = (n+rp-1) % n; 
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum(list, 16));
    }
}

//Time Complexity: O(n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)