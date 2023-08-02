//find number of ways to reach from (0,0) to (N-1,M-1) in N*M grid
public class grid_ways {
    public static int gridWays(int i, int j, int n, int m){
        //base case
        if(i == n-1 && j == m-1){  //condition for last cell
            return 1;
        } else if(i == n || j == m){  //boundary cross condition
            return 0;
        }
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);

        return w1 + w2;
    }
    public static int fact(int num){
        //base case
        if(num == 0){
            return 1;
        }
        return num * fact(num-1);
    }
    public static void main(String args[]){
        int n = 3, m = 3;
        //by backtracking
        //Time Complexity : o(2^(n+m))  ->exponential T.C.
        System.out.println(gridWays(0, 0, n, m));


        //optimized way - by permutation
        //Time Complexity : o(n)  -> linear T.C.
        System.out.println(fact(n-1+m-1)/(fact(n-1)*(fact(m-1))));
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)