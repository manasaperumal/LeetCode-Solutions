/*
LeetCode 121 - Best Time to Buy and Sell Stock

Topic: Arrays

Problem:
You are given an array prices where prices[i] is the price
of a stock on the ith day.

You can buy one stock on one day and sell it on a later day.
Return the maximum profit possible. If no profit can be made,
return 0.

Approach:
1. Keep track of the minimum buying price seen so far.
2. For each day, calculate the profit if we sell on that day.
3. Update the maximum profit whenever a larger profit is found.
4. Return the maximum profit at the end.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;

        int profit = 0;
        int buyingPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= buyingPrice) {
                buyingPrice = prices[i];
                continue;
            }

            profit = Math.max(profit, prices[i] - buyingPrice);
        }

        return profit;
    }
}
