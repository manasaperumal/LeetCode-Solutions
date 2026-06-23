/*
LeetCode 169 - Majority Element

Topic: Arrays, Boyer-Moore Voting Algorithm

Problem:
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than
⌊n / 2⌋ times. It is guaranteed that the majority element exists.

Approach:
1. Maintain two variables:
   - candidate: potential majority element.
   - count: vote count of the candidate.
2. If count becomes 0, choose the current element
   as the new candidate.
3. If the current element equals the candidate,
   increment count.
4. Otherwise, decrement count.
5. After one traversal, the candidate will be
   the majority element.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
