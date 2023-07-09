
public class numbers {
    //calculate factorial  of a number
    public static int factorial(int n){
        int fact = 1;
        if(n == 0){
            return 1;
        }
        fact = n * factorial(n-1);    
        return fact;
    }
    //calculate the sum of n natural number
    public static int natural(int n){
        int num = 1;
        if(n == 1){
            return 1;
        }
        num = n + natural(n-1);    
        return num;
    }
    //calculate nth term in fibonacci
    public static int fib(int n){
        if(n == 1 || n == 0){
            return n;
        }
        int fn = fib(n-1) + fib(n-2);
        return fn;
    }
    public static void main(String args[]){
        System.out.println("factorial is: " +factorial(5));
        System.out.println("sum of natural number is: " +natural(5));
        System.out.println("nh term in fibonacci is: " +fib(6));

    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)