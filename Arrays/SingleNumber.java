/*
LeetCode 136 - Single Number

Topic: Arrays, HashSet

Problem:
Given a non-empty array of integers nums,
every element appears twice except for one.
Find and return that single element.

Approach:
1. Use a HashSet to store elements.
2. If an element is already present,
   remove it from the set.
3. Otherwise, add it to the set.
4. At the end, the set contains only
   the element that appeared once.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashSet;

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> s = new HashSet<>();

        for (int num : nums) {
            if (s.contains(num)) {
                s.remove(num);
            } else {
                s.add(num);
            }
        }

        for (int num : s) {
            return num;
        }

        return -1;
    }
}
