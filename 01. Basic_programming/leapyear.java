//program to find whether the year leap year or not
import java.util.*;
public class leapyear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        //boolean is a datatype and x,y,z are variables
        boolean x = (year%4)==0;
        boolean y = (year%100)!=0;
        boolean z = ((year%100==0) && (year % 400 ==0));

        if (x && (y||z)){
            System.out.println(year+"is a leap year");
        }
        else{
            System.out.println(year+"is not a leap year");
        }
        sc.close();
    }
}

//If you liked my code do give stars:-)
//Keep coding!!
//Thankyou;-)