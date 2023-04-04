//code to print the diamond 
import java.util.*;
public class diamond {
    public static void diamond_pattern(int n){
        //first half structure
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop-for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars-boundary condition
            for(int j=1; j<=(2*i-1); j++){   
                System.out.print("*");
            }
            System.out.println();
        }
        //second half structure
        //outer loop
        for(int i=n; i>=1; i--){
            //inner loop-for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars-boundary condition
            for(int j=1; j<=(2*i-1); j++){   
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
        diamond_pattern(n);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)