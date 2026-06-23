/*
LeetCode 977 - Squares of a Sorted Array

Topic: Arrays, Two Pointers

Problem:
Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in
non-decreasing order.

Approach:
1. Use two pointers:
   - left starts at the beginning of the array.
   - right starts at the end of the array.
2. Compare the absolute values at both ends.
3. Place the larger square at the end of the result array.
4. Move the corresponding pointer inward.
5. Continue until all positions are filled.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index] = nums[left] * nums[left];
                left++;
            } else {
                result[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }

        return result;
    }
}
