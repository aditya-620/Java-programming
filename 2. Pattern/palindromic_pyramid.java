//program for make a palindromic_pyramid
import java.util.*;
public class palindromic_pyramid {
    public static void palindromic_pattern(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            //for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for numbers
            for(int j=i; j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        palindromic_pattern(n);
        sc.close();
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)