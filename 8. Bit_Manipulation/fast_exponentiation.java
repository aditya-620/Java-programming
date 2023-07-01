//to find the exponent of a number (a^n)
import java.util.*;
public class fast_exponentiation {
    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){   //checking LSB
                ans = ans * a;
            }
            a=a*a;
            n=n>>1;
        }
    return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base:");
        int a = sc.nextInt();
        System.out.println("Enter the vlaue of the power");
        int n = sc.nextInt();
        System.out.println("Answer is: " +fastExpo(a,n));
    }
}
//Time Complexity: O(logn + 1)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)