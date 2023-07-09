//calculae factorial  of a number
public class factorial {
    public static int factorial(int n){
        int fact = 1;
        if(n == 0){
            return 1;
        }
        fact = n * factorial(n-1);    
        return fact;
    }
    public static void main(String args[]){
        System.out.println(factorial(5));
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)