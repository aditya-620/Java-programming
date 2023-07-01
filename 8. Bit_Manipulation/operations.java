//simple operations 
import java.util.*;
public class operations{
    public static int get_ith_bit(int nums, int i){
        int bitMask = 1 << i;
        if((nums & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int set_ith_bit(int nums, int i){
        int bitMask = 1 << i;
        return nums | bitMask;
    }

    public static int clear_ith_bit(int nums, int i){
        int bitMask = ~(1 << i);
        return nums & bitMask;
    }

    public static int upadte_ith_bit(int nums, int i, int newbit){
        //method I
        // if(newbit == 0){
        //     return clear_ith_bit(nums, i);
        // }else{
        //     return set_ith_bit(nums, i);
        // }

        //method II
        nums = clear_ith_bit(nums, i);
        int bitMask = newbit << i;
        return nums | bitMask;
    }

    public static int clear_I_bit(int nums, int i){
        int bitMask = ~0 << i;
        return nums & bitMask;
    }

    public static int clear_range(int nums, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;
        int bitMask = a|b;
        return nums & bitMask;
    }

    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
   }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        // System.out.println("enter the index");
        // int i = sc.nextInt();

        System.out.println("At " +2 +"th index bit is: " +get_ith_bit(num, 2));

        System.out.println(set_ith_bit(num, 2));

        System.out.println(clear_ith_bit(num, 1));

        System.out.println(upadte_ith_bit(num, 2, 1));

        System.out.println(clear_I_bit(15, 2));

        System.out.println(clear_range(num, 2, 4));

        System.out.println(isPowerOfTwo(16));
    }
}


//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)