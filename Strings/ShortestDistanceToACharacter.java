/*
LeetCode 821 - Shortest Distance to a Character

Topic: Strings, Two Passes

Problem:
Given a string s and a character c that occurs in s,
return an array where answer[i] is the distance from
index i to the closest occurrence of character c.

Approach:
1. Traverse from left to right and store the distance
   from the nearest occurrence of c on the left.
2. Traverse from right to left and update each position
   with the minimum distance from the nearest occurrence
   of c on the right.
3. Return the resulting array.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];

        int prev = -n;

        // Left to Right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            answer[i] = i - prev;
        }

        prev = 2 * n;

        // Right to Left
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            answer[i] = Math.min(answer[i], prev - i);
        }

        return answer;
    }
}
