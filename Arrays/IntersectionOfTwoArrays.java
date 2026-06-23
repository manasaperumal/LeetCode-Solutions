/*
LeetCode 349 - Intersection of Two Arrays

Topic: Arrays, Hashing

Problem:
Given two integer arrays nums1 and nums2, return an array
of their intersection. Each element in the result must be
unique and can be returned in any order.

Approach:
1. Store all elements of nums1 in a HashMap.
2. Traverse nums2.
3. If an element exists in the map and has not been added
   to the result before, add it to the result.
4. Mark the element as processed to avoid duplicates.
5. Convert the ArrayList into an integer array and return it.

Time Complexity: O(n + m)
Space Complexity: O(n)

where:
n = nums1.length
m = nums2.length
*/

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            map.put(num, 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) == 1) {
                result.add(num);
                map.put(num, 0);
            }
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
