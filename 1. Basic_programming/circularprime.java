//circular prime code
//code doesn't work

import java.util.*;
public class circularprime {
    public static void main(String args[]){
        System.out.println("enter a number n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n<1000){
            System.out.println("enter four digit number");
        }
        else{
            boolean isPrime = true;
                
                for(int i=1;i<=4;i++){
                    for(int j=2; j<=Math.sqrt(n);j++){
                        
                        if (n%j==0){
                            isPrime = false;
                        }
                    }
                    if(isPrime==true){
                        count++;
                    }
                    int p=n%10;
                    n=n/10;
                    n=(p*1000)+n;
                }
            if (count==4){ 
                System.out.println("n is prime"); }
            else{
                System.out.println("n is not prime");
            }
        }
        sc.close();
    }
}

