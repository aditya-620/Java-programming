//PROGRAM FOR TOWER OF HANOI

public class tower_of_hanoi {
    public static void towerOfHanoi(int n, char src, char dest, char help){
        //base case
        if(n==1){
            System.out.println("Move disk" +n+ " from " +src+ " to " +dest);
            return;
        }
        //step-1
        towerOfHanoi(n-1, src, help, dest);
        //step-2
        System.out.println("Move disk" +n+ " from " +src+ " to " +dest);
        //step-3
        towerOfHanoi(n-1, help, dest, src);
    }
    public static void main(String args[]){
        towerOfHanoi(3, 'A', 'B', 'C');
    }
}

//Time complexity: O(2^n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)