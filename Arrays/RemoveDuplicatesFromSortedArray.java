/*
LeetCode 26 - Remove Duplicates from Sorted Array

Topic: Arrays, Two Pointers

Problem:
Given a sorted integer array nums, remove the duplicates
in-place such that each unique element appears only once.
Return the number of unique elements.

Approach:
1. Use two pointers:
   - i points to the last unique element.
   - j traverses the array.
2. If nums[j] is different from nums[i],
   increment i and place nums[j] at nums[i].
3. After traversal, the first (i + 1) elements
   contain all unique values.
4. Return i + 1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;

        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
