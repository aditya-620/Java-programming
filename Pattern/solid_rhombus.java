//code to print the solid rhombus
import java.util.*;
public class solid_rhombus {
    public static void solid_rhom(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop-for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j= 1; j<=n; j++){
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
        solid_rhom(n);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)