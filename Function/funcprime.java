//program to find out all the prime numbers in a range
import java.util.*;
//function to check a number is prime or not
public class funcprime {
    public static boolean isPrime(int n){
        if (n == 2){
            boolean isPrime = true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void primeinRange(int n){
        for(int i=2; i<=n-1; i++){
            if(isPrime(i) == true){                       //function calling to check prime
                System.out.println(i);
            }
        }
    }
    //main function block
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range(n)");
        int n = sc.nextInt();
        primeinRange(n);                             //function call to primeinRange function
        sc.close();
    }
}

//If you liked my code do give stars:-)
//Keep coding!!
//Thankyou;-)