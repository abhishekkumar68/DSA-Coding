class Solution {
    public int maxProfit(int[] prices) {
        // int max = 0;
        // int min = Integer.MAX_VALUE;
        // for(int i=0;i<prices.length;i++){
        //     if(prices[i]<min){
        //         min=prices[i];
        //     }
        //     int currMax = prices[i]-min;
        //     max = Math.max(currMax, max);
        // }
        // return max;
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=0;i<prices.length;i++){
            int profit = prices[i]-minPrice;
            maxProfit = Math.max(profit, maxProfit);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }
}