//program to find the max subarray sum - BRUTE FORCE
public class max_subarray_sum_M1 {
    public static void subarrayssum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;    //maxsum = -infinity
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    //subarray sum
                    currSum += numbers[k];   
                }
                System.out.println(currSum);
                if (currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max subarray sum " + maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {1, -2, 6, -1, 3};
        subarrayssum(numbers);
    }
    
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)