import java.util.*;
public class reverse_no {
    public static void main(String argss[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

// these two code is just printing reverse number
//ques: print the reverse of a number

        //by for loop

        // for(; n>0; n=n/10 ){
        //     int leftdigit = n%10;
        //     System.out.print(leftdigit);
        // }

        //by while loop

        // while (n>0){
        //     int lastdigit = n%10;
        //     System.out.print(lastdigit);
        //     n/=10;
        // }


//now, ques: reverse the given number
            int rev = 0;
            while (n>0){
                int lastdigit = n % 10;
                rev = (rev*10)+lastdigit;
                n=n/10;
            }
            System.out.print(rev);
    sc.close();
    }
}
