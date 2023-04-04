import java.util.*;
public class while1 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int counter = 1;
    int sum = 0;
    while (counter<=n){
        sum=sum+counter;
        System.out.println(counter);
        counter++;
    }
    System.out.print("your sum is: " +sum);
    sc.close();
    }
}
