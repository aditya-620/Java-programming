//simple array input/output program
import java.util.*;
public class array1{
    public static void main(String args[]){
        int marks[] = new int[100];      //creating array size
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks");
        marks[0] = sc.nextInt();       //taking input in array at index 0
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy: " +marks[0]);     
        System.out.println("maths: " +marks[1]);
        System.out.println("chem: " +marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percenage: "+percentage+"%");

        marks[2] = marks[2]+1;    //updating array element
        System.out.println("Updated chem marks: "+marks[2]);
        sc.close();
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)