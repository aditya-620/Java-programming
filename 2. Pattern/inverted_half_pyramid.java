//program to print inverted and rotated half-pyramid
import java.util.*;
public class inverted_half_pyramid {

    //function defination
    public static void inverted_rotated_half_pyramid(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            //for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        sc.close();

        //function call
        inverted_rotated_half_pyramid(n);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)