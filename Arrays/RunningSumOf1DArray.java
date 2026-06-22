/*
LeetCode 1480 - Running Sum of 1d Array

Topic: Arrays

Problem:
Given an array nums, return the running sum of nums.

The running sum is defined as:
runningSum[i] = nums[0] + nums[1] + ... + nums[i]

Approach:
1. Start from index 1.
2. Add the previous element's running sum to the current element.
3. Store the result back in the same array.
4. Return the modified array.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
