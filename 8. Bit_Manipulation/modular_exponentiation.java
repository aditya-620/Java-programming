
//overflow may occur for large values of a or n. Therefore, power is generally evaluated under the modulo of a large number.
//(ab) mod p = ( (a mod p) (b mod p) ) mod p 

public class modular_exponentiation {
    public static long moduExpo(int a, int n, int p){
        long ans = 1;
        while( n > 0 ){
            if((n & 1) != 0){   //checking LSB
                ans = (ans % p * a % p) % p;
            }
            a = (a % p * a % p) % p;
            n = n >> 1;
        }
    return ans;
    }
    public static void main(String args[]){
        int a = 2;
        int n = 5;
        int p = 13;
        System.out.print("Power is " + moduExpo(a, n, p));
    }
}

// Time Complexity: O(Log y), where y represents the value of the given input.
// Auxiliary Space: O(1), as we are not using any extra space.

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)