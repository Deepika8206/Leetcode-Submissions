// ======================================
// LeetCode Problem: best time to buy and sell stock
// Language: java
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Synced by: LinkCode
// Date: 11/19/2026, 2:23:56 PM
// ======================================


class Solution {
    public int maxProfit(int[] prices) {
        int minprofit = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i =0;i <prices.length;i++){
            if(prices[i]<minprofit){
                minprofit=prices[i];
            }
            int profit = prices[i] - minprofit;
            if(profit > maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
}