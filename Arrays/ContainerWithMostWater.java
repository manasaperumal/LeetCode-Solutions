/*
LeetCode 11 - Container With Most Water

Topic: Arrays, Two Pointers, Greedy

Problem:
Given an array height where each element represents
the height of a vertical line, find two lines that,
together with the x-axis, form a container that holds
the maximum amount of water.

Approach:
1. Place one pointer at the beginning and one at the end.
2. Calculate the current area:
      min(height[left], height[right])
      * (right - left)
3. Update the maximum area found so far.
4. Move the pointer with the smaller height inward,
   because moving the taller line cannot increase
   the area if the shorter line remains unchanged.
5. Continue until the pointers meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {
            int currentArea =
                    Math.min(height[left], height[right])
                    * (right - left);

            maxArea = Math.max(maxArea, currentArea);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
