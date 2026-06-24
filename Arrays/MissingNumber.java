/*
LeetCode 268 - Missing Number

Topic: Arrays, Math

Problem:
Given an array nums containing n distinct numbers
in the range [0, n], return the only number that
is missing from the array.

Approach:
1. Calculate the sum of all elements present in the array.
2. Calculate the expected sum of numbers from 0 to n
   using the formula:
       n * (n + 1) / 2
3. The difference between the expected sum and
   the actual sum is the missing number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int sumWithoutMissing = 0;
        for (int i = 0; i < n; i++) {
            sumWithoutMissing += nums[i];
        }

        int sumWithMissing = (n * (n + 1)) / 2;

        int missingNum = sumWithMissing - sumWithoutMissing;

        return missingNum;
    }
}
