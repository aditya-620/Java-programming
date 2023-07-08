//program for simple billing system
import java.util.*;
public class bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate of pencil:");
        float pencil = sc.nextFloat();

        System.out.println("Enter the rate of pen:");
        float pen = sc.nextFloat();

        System.out.println("Enter the rate of ereaser:");
        float ereaser = sc.nextFloat();

        //total amount
        float total = pencil+pen+ereaser;
        System.out.println("Bill is:"+total);

        //including tax
        float newtotal = total+(0.18f*total);
        System.out.println("Bill with 18% tax:"+newtotal);
        sc.close();
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)