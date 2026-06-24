/*
LeetCode 704 - Binary Search

Topic: Arrays, Binary Search

Problem:
Given a sorted array of integers nums and an integer target,
return the index of target if it exists in the array.
Otherwise, return -1.

The solution must run in O(log n) time complexity.

Approach:
1. Initialize two pointers:
   - l = 0 (left boundary)
   - r = nums.length - 1 (right boundary)
2. While l <= r:
   - Find the middle index:
       m = l + (r - l) / 2
   - If nums[m] > target, search the left half.
   - If nums[m] < target, search the right half.
   - Otherwise, return m.
3. If the loop ends, the target is not present,
   so return -1.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                return m;
            }
        }

        return -1;
    }
}
