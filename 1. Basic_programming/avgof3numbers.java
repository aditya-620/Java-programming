//program to find average of three numbers
import java.util.*;
public class avgof3numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        
        int average = (a+b+c)/3;
        System.out.printf("your average is %d", average);
        sc.close();
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)