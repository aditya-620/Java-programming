//continue and break statement program
import java.util.*;
public class continue1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter the number");
            int n = sc.nextInt();
             if (n%10 == 0){
                continue;
             }
             if (n==1){
                break;
             }
             System.out.println(n);
        }while(true);
        sc.close();
    }

}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)