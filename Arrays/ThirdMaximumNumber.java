/*
LeetCode 414 - Third Maximum Number

Topic: Arrays, Traversal

Problem:
Given an integer array nums, return the third
distinct maximum number in the array.
If the third distinct maximum does not exist,
return the maximum number.

Approach:
1. Maintain three variables:
   - max   : largest distinct number
   - smax  : second largest distinct number
   - tmax  : third largest distinct number
2. Initialize all three to Long.MIN_VALUE.
3. Traverse the array and update these values
   while avoiding duplicates.
4. If tmax was never updated, return max.
   Otherwise, return tmax.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                tmax = smax;
                smax = max;
                max = num;
            } else if (num > smax && num != max) {
                tmax = smax;
                smax = num;
            } else if (num > tmax && num != smax && num != max) {
                tmax = num;
            }
        }

        return tmax != Long.MIN_VALUE ? (int) tmax : (int) max;
    }
}
