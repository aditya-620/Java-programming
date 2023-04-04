//program to convert binary number to decimal number
import java.util.*;
public class bintodec {

    //function defination
    public static void isbintodec(int binnum){
        int pow = 0;
        int decNum = 0;

        while(binnum>0){
            int last_digit = binnum % 10;
            decNum =decNum+(last_digit*(int)Math.pow(2,pow));
             pow++;
             binnum=binnum/10;
        }
        System.out.println(decNum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        int n = sc.nextInt();
        sc.close();

        //function calling
        isbintodec(n);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)