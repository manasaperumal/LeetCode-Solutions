/*
LeetCode 2529 - Maximum Count of Positive Integer and Negative Integer

Topic: Arrays

Problem:
Given a sorted array nums, return the maximum between
the number of positive integers and the number of
negative integers. Note that 0 is neither positive
nor negative.

Approach:
1. Traverse the array once.
2. Count the number of negative integers.
3. Count the number of positive integers.
4. Ignore zeros.
5. Return the maximum of the two counts.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maximumCount(int[] nums) {
        int negative = 0;
        int positive = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negative++;
            } else if (nums[i] > 0) {
                positive++;
            }
        }

        return Math.max(positive, negative);
    }
}
