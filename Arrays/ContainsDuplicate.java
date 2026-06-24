/*
LeetCode 217 - Contains Duplicate

Topic: Arrays, Sorting

Problem:
Given an integer array nums, return true if any value
appears at least twice in the array, and return false
if every element is distinct.

Approach:
1. Sort the array.
2. Traverse the array from index 1.
3. Compare each element with its previous element.
4. If two adjacent elements are equal,
   a duplicate exists.
5. Otherwise, all elements are distinct.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
}
