//minimum absolute difference
import java.util.Arrays;

public class min_absolute_diff {
    public static void main(String args[]){
        int A[] = {1, 2, 3};
        int B[] = {2, 1, 3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("min absolute difference of pairs: " +minDiff);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)