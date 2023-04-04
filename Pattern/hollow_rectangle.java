//program to print hollow rectangle pattern
import java.util.*;
public class hollow_rectangle {
    //function defination
    public static void hollow_rectangle_(int totRow,int totCol){
        //outer loop
        for(int i=1; i<=totRow; i++){
            //inner loop
            for(int j=1; j<=totCol; j++){
                //boundary condition
                if(i==1 || i == totRow || j == 1 || j == totCol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }    
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int totRow = sc.nextInt();
        System.out.println("Enter the number of columns");
        int totCol = sc.nextInt();
        sc.close();

        //function calling
        hollow_rectangle_(totRow,totCol);
    }
}

//If you liked my code do give stars:-)
//Keep coding!!
//Thankyou;-)