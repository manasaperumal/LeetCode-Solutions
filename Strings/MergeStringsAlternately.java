/*
LeetCode 1768 - Merge Strings Alternately

Topic: Strings, String Manipulation

Problem:
Given two strings word1 and word2, merge them by adding
letters in alternating order, starting with word1.
If one string is longer than the other, append its
remaining characters to the end of the merged string.

Approach:
1. Find the minimum length of the two strings.
2. Traverse both strings up to the minimum length.
3. Alternately append characters from word1 and word2
   to a StringBuilder.
4. Append the remaining part of the longer string.
5. Return the final merged string.

Time Complexity: O(n + m)
Space Complexity: O(n + m)

where:
n = length of word1
m = length of word2
*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int min = Math.min(len1, len2);

        String longerString = "";

        if (min == len1) {
            longerString = word2;
        }

        if (min == len2) {
            longerString = word1;
        }

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < min; i++) {
            sb.append(chars1[i]);
            sb.append(chars2[i]);
        }

        sb.append(longerString.substring(min));

        return sb.toString();
    }
}
