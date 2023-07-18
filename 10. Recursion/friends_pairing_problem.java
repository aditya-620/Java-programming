//Friends Pairing Problem

//Given n friends, each one can remain single or can be paired up with some other friend. 
//Each friend can be paired only once. 
//Find out the total number of ways in which friends can remain single or can be paired up.

public class friends_pairing_problem {
    public static int friendsPairing(int n){
        //base case
        if((n == 1) || (n == 2)){
            return n;
        }

        //choice
        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairways = (n-1) * fnm2;

        int total_ways = fnm1 + pairways;
        return total_ways;

        //return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void main(String args[]){
        System.out.println(friendsPairing(3));
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-) 