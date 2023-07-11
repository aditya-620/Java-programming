//program to print the value of x^n
public class exponential {
    // public static int power(int x, int n){
    //     if(n == 0){
    //         return 1;}
    //     return x * power(x , n-1);          //time complexity: O(n)
    // }

    //optimized code (Time Complexity: O(logn))
    public static int optimizedPower(int x, int n){
        if (n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfpowersq = halfPower * halfPower;

        //n = odd
        if(n % 2 != 0){
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String args[]){
        System.out.println(optimizedPower(2,10));
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-) 