//program to find the max subarray sum - PREFIX SUM
public class max_subarray_sum_M2 {
    public static void subarrayssum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;    //maxsum = -infinity
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculation of prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
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