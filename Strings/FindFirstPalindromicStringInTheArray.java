/*
LeetCode 2108 - Find First Palindromic String in the Array

Topic: Strings, Palindrome

Problem:
Given an array of strings words, return the first
palindromic string in the array. If no palindrome
exists, return an empty string.

Approach:
1. Traverse the array of strings.
2. For each word, reverse it using StringBuilder.
3. Compare the original string with its reversed version.
4. Return the first string that is equal to its reverse.
5. If no palindrome is found, return an empty string.

Time Complexity: O(n × m)
Space Complexity: O(m)

where:
n = number of strings
m = average length of a string
*/

class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String rev = new StringBuilder(words[i]).reverse().toString();

            if (words[i].equals(rev)) {
                return words[i];
            }
        }

        return "";
    }
}
