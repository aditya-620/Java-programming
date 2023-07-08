//program to print a butterfly pattern
import java.util.*;
public class  butterfly_pattern{
    public static void pattern(int n){
        //first half pattern
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half pattern
        //outer loop
        for(int i=n; i>=1; i--){
            //inner loop
            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        //function calling
        pattern(n);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)