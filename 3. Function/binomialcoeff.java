//program to get the binomial coefficient using function
//factorial function is called 3 times in this code with made our work more easy

import java.util.*;
public class binomialcoeff {
    public static int facti(int a){
        int fact = 1;
        for(int i=a;i>=1;i--){
            fact*=i;
        }
        return fact;
    }
    public static int bincoeff(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        int n_fact=facti(n);
        int r_fact=facti(r);
        int nmr_fact=facti(n-r);
        int bincoeff = n_fact/(r_fact*nmr_fact);
        sc.close();
        return bincoeff;
    }
    public static void main(String args[]){
        System.out.println("your binomial coefficient is:"+bincoeff());
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)