import java.util.*;
public class test {
    public static boolean prime(int n){
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n);i++){
            if (n%i==0){
                isPrime = false;
            }
        }
        return isPrime;
    }
        public static void main(String args[]){
            System.out.println("enter a number n");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int count = 0;
            boolean isPrime;
            if(isPrime == true){
                int p=n%10;
                n=n/10;
                n=(p*1000)+n;
                for(int i=1;i<=4;i++){
                    prime(n);
                    count++;
                }
                if (count==4)
                    System.out.println("n is prime");
                else{
                    System.out.println("n is not prime");
                    }
            }
            
        
        sc.close();
    }
}
