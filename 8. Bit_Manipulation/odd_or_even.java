//check whether the number is Even or Odd with the help of bit manipulation
import java.util.*;
public class odd_or_even {
    public static boolean oddOrEven(int num){
        int bitMask = 1;
        if ((num & bitMask) == 0){     //
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean check = oddOrEven(num);
        if (check == true){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)