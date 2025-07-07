public class fabonacci {
    //by recursion
    public static int fibRec(int n){
        //base case
        if(n==0 || n==1){
            return n;
        }
        return fibRec(n-1) + fibRec(n-2);
    }
    //Time Complexity: O(2^n) - exponential time complexity
    //Space Complexity: O(n) - due to the recursive stack space


    //by memoization
    public static int fibMemo(int n, int f[]){
        //base case
        if(n==0 || n==1){
            return n;
        }

        if(f[n] != 0){
            return f[n]; //if already calculated, return the value
        }
        f[n] = fibMemo(n-1, f) + fibMemo(n-2, f); //store the value in the array
        return f[n];
    }
    //Time Complexity: O(n) - linear time complexity
    //Space Complexity: O(n) for the memoization array


    //by tabulation
    public static int fibTab(int n){
        int f[] = new int[n+1];
        f[0] = 0; //base case
        f[1] = 1; //base case

        for(int i=2; i<=n; i++){
            f[i] = f[i-1] + f[i-2]; //store the value in the array
        }
        return f[n];
    }
    //Time Complexity: O(n) - linear time complexity
    //Space Complexity: O(n) for the tabulation array

    public static void main(String[] args) {
        System.out.println("Fibonacci by Recursion: " + fibRec(5));
        int n = 5;
        int f[] = new int[n+1];
        System.out.println("Fibonacci by Memoization: " + fibMemo(n, f));
        System.out.println("Fibonacci by Tabulation: " + fibTab(n));
    }
}
