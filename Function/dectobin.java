//this program is to convert decimal number to binary 
import java.util.*;
public class dectobin {
    //function defination
    public static void isdectobin(int n){
        int pow = 0;
        int binNum = 0;
        
        while(n>0){
            int rem = n % 2;
            binNum = binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println(binNum);
    }
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        //function calling
        isdectobin(n);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)