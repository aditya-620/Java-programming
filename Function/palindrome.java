//code to check whether the number is palindrome

//A palindrome number is a number that remains the same when digits are reversed.
//For example, the number 12321 is a palindrome number, but 1451 is not a palindrome number.

import java.util.*;
public class palindrome {
    public static int ispalindrome(int n){
        int rev = 0;
        while (n>0){
            int lastdigit = n % 10;
            rev = (rev*10)+lastdigit;
            n=n/10;
        }
        return rev;
    }
    public static void main(String Args[]){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=ispalindrome(num);
        sc.close();
        if (rev == num){
            System.out.println(num+" is a palindrome number");
        }
        else{
            System.out.println(num+" is not a palindrome number");
        }    
    }
}

//If you liked my code do give stars:-)
//Keep coding!!
//Thankyou;-)