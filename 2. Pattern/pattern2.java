//code to print the inverted half-pyramid
import java.util.*;
public class pattern2 {
    public static void inverted_half_pyramid(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        sc.close();
        //function calling
        inverted_half_pyramid(n);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)