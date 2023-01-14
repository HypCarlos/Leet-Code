class Solution {
    public int maxProfit(int[] prices) {
        /*
        TRAVERSE ARRAY TO GATHER INPUT
        i = index or day
        buy on lowest 
        sell on highest
        
        [7,1,5,3,6,4]
        
        */
      
        int profit = 0; // HIGEST CURRENT (INDEX - BUY)
        int buy = Integer.MAX_VALUE; //MINIMUM PRICE (INTEGER.MAX_VALUE ALLOWS YOU NOT TO WORRY FOR FIRST CASE WHERE BUY WOULD BE ZERO- 2147483647)
        
        for(int i=0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
    
}