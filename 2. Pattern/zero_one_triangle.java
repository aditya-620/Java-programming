//program to print a 0-1 triangle
import java.util.*;
public class  zero_one_triangle{
    public static void zero_one_tri(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
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
        zero_one_tri(n);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)