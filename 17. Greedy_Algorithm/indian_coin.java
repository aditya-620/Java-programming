//find minimum number of coins/notes to make change for a value.
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class indian_coin {
    public static void main(String args[]){
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};  
        //without Integer datatype, as without this we will be not able to call reverseOrder

        //sorting in decending order
        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("total min coins used: " +countOfCoins);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) +" ");
        }
        System.out.println();
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)