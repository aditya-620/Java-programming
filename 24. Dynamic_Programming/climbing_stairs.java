import java.util.Arrays;

public class climbing_stairs {
    //by recursion
    public static int climbStairsRec(int n){
        //base case
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        return climbStairsRec(n-1) + climbStairsRec(n-2);
    }

    //by memoization
    public static int climbStairsMemo(int n, int dp[]){
        //base case
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n]; //if already calculated, return the value
        }

        dp[n] = climbStairsMemo(n-1, dp) + climbStairsMemo(n-2, dp); //store the value in the array
        return dp[n];
    }
    //by tabulation
    public static int climbStairsTab(int n){
        int ways[]= new int[n+1];   //0 -> n
        ways[0] = 1; //base case

        for(int i=1; i<=n; i++){
            if(i == 1){
                ways[i] = ways[i-1];
            } else {
                ways[i] = ways[i-1] + ways[i-2]; //store the value in the array
            }
        }
        return ways[n];
    }

    public static void main(String[] args) {
        System.out.println("Climbing Stairs by Recursion: " + climbStairsRec(5));
        
        
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1); // Initialize the dp array with -1 to indicate uncalculated states
        // This is important to differentiate between uncalculated states and states that return 0

        System.out.println("Climbing Stairs by Memoization: " + climbStairsMemo(n, dp));

        System.out.println("Climbing Stairs by Tabulation: " + climbStairsTab(n));
        // Time Complexity: O(n) for both memoization and tabulation
    }
}
