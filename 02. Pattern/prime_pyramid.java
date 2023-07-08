import java.util.*;
public class prime_pyramid {
        public static boolean isPrimeNumber(int num) {
            int c=0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    c++;
            }
            if (c==2)
                return true;
            else
                return false;
}
public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter no. of rows : ");
        int rows = sc.nextInt();

        int counter = 2;    
        for (int i = 1; i <= rows; i++) {
            //for spaces
            for(int j=1; j<=rows-i;j++){
                System.out.print("   ");
            }

            for (int j = 1; j <= 2*i-1; j++) {
                /* Try to find next prime number by incrementing counter and testing it for primality */ 
                while(!isPrimeNumber(counter)){
                    counter++;
                }
            System.out.print(counter+" ");
            counter++;
            }
        System.out.println();
        }
        sc.close();
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)