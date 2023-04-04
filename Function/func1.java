//program to add two numbers using function
//with argument and return type

import java.util.*;
//function defination
public class func1 {
    public static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    //main function
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        System.out.println("enter the number");
        int b=sc.nextInt();

        //function calling
        int sum = sum(a, b);
        System.out.println("your sum is: " +sum);
        sc.close();
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)