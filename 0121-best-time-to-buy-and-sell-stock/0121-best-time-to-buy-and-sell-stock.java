class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxProfit=0, minPrice = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
             if(prices[i]<minPrice)
             {
                minPrice = prices[i];
             }

             int profit = prices[i] - minPrice;

             maxProfit = Math.max(maxProfit,profit);
             
        }

        return maxProfit;

        
    }
}