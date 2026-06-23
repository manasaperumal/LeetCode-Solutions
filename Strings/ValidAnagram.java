/*
LeetCode 242 - Valid Anagram

Topic: Strings, Hashing, Frequency Counting

Problem:
Given two strings s and t, return true if t is an
anagram of s, and false otherwise.

An anagram is a word formed by rearranging the letters
of another word using all the original letters exactly once.

Approach:
1. If the lengths of the strings are different,
   they cannot be anagrams.
2. Create a frequency array of size 26 for lowercase letters.
3. Traverse both strings simultaneously:
   - Increment the count for characters in s.
   - Decrement the count for characters in t.
4. If all frequencies become zero, the strings are anagrams.
5. Otherwise, they are not anagrams.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
