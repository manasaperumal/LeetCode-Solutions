/*
LeetCode 27 - Remove Element

Topic: Arrays, Two Pointers, In-Place Algorithms

Problem:
Given an integer array nums and an integer val,
remove all occurrences of val in-place and return
the number of elements that are not equal to val.

The first k elements of nums should contain all
elements that are not equal to val.

Approach:
1. Maintain an index pointer ind.
2. Traverse the array using pointer j.
3. If nums[j] is not equal to val,
   place it at nums[ind] and increment ind.
4. After traversal, ind represents the number
   of elements remaining in the array.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int ind = 0;

        for (int j = 0; j < n; j++) {
            if (nums[j] != val) {
                nums[ind++] = nums[j];
            }
        }

        return ind;
    }
}
