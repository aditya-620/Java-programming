//program to find a string is a palindrome
import java.util.*;
public class palindrome {
    public static boolean isPalindrome(String str){
        for(int i =0; i<str.length()/2; i++){
            int n = str.length();      //length of the string
            if(str.charAt(i) != str.charAt(n-1-i)){    //checking first and last character of the string
                return false;
            }
        }
        return true;

    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string to check for palindrome:");
        str = sc.nextLine();
        System.out.println(isPalindrome(str));
        sc.close();
    }
}

//Time Complexity: O(n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)