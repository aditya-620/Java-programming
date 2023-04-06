//program to find the max subarray sum - KADANE'S ALGO.
public class max_subarray_sum_M3 {
    public static void kadane(int numbers[]){
        int ms = Integer.MIN_VALUE;   //maxSum(ms) = -infinity
        int cs = 0;    //currentSum

        //loop
        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs<0){        
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max subarray sum is: " +ms);
    }

    public static void main(String args[]){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(numbers);
    }
}

//Time complexity: O(n)
//For more info visit: https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/


//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)