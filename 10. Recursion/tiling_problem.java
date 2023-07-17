//Given a “2 x n” board and tiles of size “2 x 1”, 
//count the number of ways to tile the given board using the 2 x 1 tiles. 
//A tile can either be placed horizontally i.e., as a 1 x 2 tile or vertically i.e., as 2 x 1 tile. 

public class tiling_problem {
    public static int tilingproblem(int n){
        //base case
        if((n == 0) || (n == 1)){
            return 1;
        }
        //verticle choice
        int fnm1 = tilingproblem(n-1);
        //horizontal choice
        int fnm2 = tilingproblem(n-2);

        int total_ways = fnm1 + fnm2;
        return total_ways;
    }
    public static void main(String args[]){
        System.out.println(tilingproblem(4));
    }    
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-) 