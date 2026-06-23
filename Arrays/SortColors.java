/*
LeetCode 75 - Sort Colors

Topic: Arrays, Three Pointers, Dutch National Flag Algorithm

Problem:
Given an array nums containing only 0s, 1s, and 2s,
sort the array in-place so that all 0s come first,
followed by 1s and then 2s.

Approach:
1. Maintain three pointers:
   - low: next position for 0
   - mid: current element being processed
   - high: next position for 2
2. If nums[mid] is:
   - 0: swap nums[low] and nums[mid],
        then increment low and mid.
   - 1: just increment mid.
   - 2: swap nums[mid] and nums[high],
        then decrement high.
3. Continue until mid crosses high.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}
