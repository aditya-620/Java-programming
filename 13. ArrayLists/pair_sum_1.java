//find if any pair in a sorted ArrayList has a target sum.
import java.util.ArrayList;

public class pair_sum_1 {
    //BRUTE FORCE - T.C.= O(n^2)
    // public static boolean pairSum(ArrayList<Integer> list, int target){
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //2 pointer approach - T.C.= O(n)
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            //case 2
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairSum(list, 5));
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)