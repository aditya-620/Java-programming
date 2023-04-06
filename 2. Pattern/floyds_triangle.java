//program to print a floyd's triangle
import java.util.*;
public class floyds_triangle {
    public static void floyds_triangle_(int n){
        //outer loop
        int counter = 1;
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
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
        floyds_triangle_(n);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)
