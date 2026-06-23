/*
LeetCode 167 - Two Sum II - Input Array Is Sorted

Topic: Arrays, Two Pointers

Problem:
Given a 1-indexed array of integers that is sorted in
non-decreasing order, find two numbers such that they add
up to the target.

Return the indices of the two numbers (1-based indexing).
Exactly one solution exists, and only constant extra space
can be used.

Approach:
1. Use two pointers:
   - l starts at the beginning of the array.
   - r starts at the end of the array.
2. Calculate the sum of numbers[l] and numbers[r].
3. If the sum is greater than the target, move r left.
4. If the sum is less than the target, move l right.
5. If the sum equals the target, return the indices
   (l + 1) and (r + 1).

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            int curSum = numbers[l] + numbers[r];

            if (curSum > target) {
                r--;
            } else if (curSum < target) {
                l++;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }

        return new int[]{};
    }
}
