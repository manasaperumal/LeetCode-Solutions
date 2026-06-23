/*
LeetCode 189 - Rotate Array

Topic: Arrays

Problem:
Given an integer array nums, rotate the array to the right
by k steps, where k is non-negative.

Approach:
1. Create a temporary array of the same size.
2. For each element nums[i], place it at its new position:
      (i + k) % n
3. Copy all elements from the temporary array back to nums.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            result[(i + k) % len] = nums[i];
        }

        for (int i = 0; i < len; i++) {
            nums[i] = result[i];
        }
    }
}
