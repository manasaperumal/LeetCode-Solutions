/*
LeetCode 1 - Two Sum

Topic: Arrays, HashMap

Problem:
Given an array of integers nums and an integer target,
return the indices of the two numbers such that they add up to target.

Approach:
1. Create a HashMap to store each number and its index.
2. For each element, calculate its complement:
      complement = target - nums[i]
3. Check if the complement already exists in the HashMap.
   - If it exists, return the indices.
   - Otherwise, store the current number and its index in the HashMap.
4. Since exactly one solution exists, return the indices immediately when found.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
