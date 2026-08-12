class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            int currprofit = prices[i] - buy;
            profit = Math.max(profit,currprofit);
            buy = Math.min(buy,prices[i]);
        }
        return profit;

    }
}