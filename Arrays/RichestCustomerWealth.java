/*
LeetCode 1672 - Richest Customer Wealth

Topic: Arrays (2D Array)

Problem:
You are given an m x n integer grid accounts where accounts[i][j]
represents the amount of money in the jth bank account of the ith customer.
Return the wealth of the richest customer.

Approach:
1. Traverse each row (customer).
2. Calculate the sum of all bank accounts for that customer.
3. Keep track of the maximum wealth found.
4. Return the maximum wealth.

Time Complexity: O(m × n)
Space Complexity: O(1)
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int rowsum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                rowsum += accounts[i][j];
            }

            if (rowsum > max) {
                max = rowsum;
            }
        }

        return max;
    }
}
