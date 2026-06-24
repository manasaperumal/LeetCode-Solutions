/*
LeetCode 283 - Move Zeroes

Topic: Arrays, Two Pointers, In-Place Algorithms

Problem:
Given an integer array nums, move all 0's to the
end of the array while maintaining the relative
order of the non-zero elements.

The operation must be performed in-place.

Approach:
1. Maintain an index pointer indicating the position
   where the next non-zero element should be placed.
2. Traverse the array:
   - If the current element is non-zero, place it at
     nums[index] and increment index.
3. After all non-zero elements are placed, fill the
   remaining positions with 0.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
