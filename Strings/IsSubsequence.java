/*
LeetCode 392 - Is Subsequence

Topic: Strings, Two Pointers

Problem:
Given two strings s and t, return true if s is a
subsequence of t, or false otherwise.

A subsequence is formed by deleting some characters
from a string without changing the order of the
remaining characters.

Approach:
1. Use two pointers:
   - i for string s
   - j for string t
2. Traverse both strings.
3. If s.charAt(i) equals t.charAt(j),
   move both pointers forward.
4. Otherwise, move only the pointer of t.
5. If i reaches the end of s, then all characters
   of s were found in order.

Time Complexity: O(n + m)
Space Complexity: O(1)

where:
n = s.length()
m = t.length()
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
