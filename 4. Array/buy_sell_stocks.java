public class buy_sell_stocks {
    public static int stocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        //loop
        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){   //profit
                int profit = prices[i] - buyPrice;  //today's profit
                maxProfit = Math.max(maxProfit,profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int prices[] = {7, 1, 5, 1, 3, 6,4};
        System.out.println(stocks(prices));
    }
}
//Time complexity: O(n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)