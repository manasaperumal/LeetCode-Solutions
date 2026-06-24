/*
LeetCode 567 - Permutation in String

Topic: Strings, Sliding Window, Frequency Array

Problem:
Given two strings s1 and s2, return true if s2 contains
a permutation of s1. Otherwise, return false.

Approach:
1. If s1 is longer than s2, return false.
2. Create two frequency arrays of size 26:
   - freq1 for s1
   - freq2 for the current window in s2
3. Fill both arrays for the first window.
4. Compare the frequency arrays.
5. Slide the window:
   - Add the new character.
   - Remove the old character.
   - Compare the frequency arrays.
6. If both arrays become equal, return true.
7. Otherwise, return false.

Time Complexity: O(26 × n) ≈ O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();

        if (l1 > l2) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < l1; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        boolean same = true;

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                same = false;
                break;
            }
        }

        if (same) {
            return true;
        }

        for (int i = l1; i < l2; i++) {
            freq2[s2.charAt(i) - 'a']++;
            freq2[s2.charAt(i - l1) - 'a']--;

            same = true;

            for (int j = 0; j < 26; j++) {
                if (freq1[j] != freq2[j]) {
                    same = false;
                    break;
                }
            }

            if (same) {
                return true;
            }
        }

        return false;
    }
}
