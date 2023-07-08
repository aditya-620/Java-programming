//count number of set bits in a binary number
//Set bits in a binary number is represented by 1. 
public class count_set_bits {
    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){   //checking LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countSetBit(15));
    }
}

//Time Complexity: O(logn + 1)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)