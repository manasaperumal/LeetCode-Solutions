/*
LeetCode 151 - Reverse Words in a String

Topic: Strings, String Manipulation, StringBuilder

Problem:
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters.
The returned string should:
1. Have words in reverse order.
2. Contain only a single space between words.
3. Have no leading or trailing spaces.

Approach:
1. Remove leading and trailing spaces using trim().
2. Split the string into words using "\\s+",
   which handles multiple spaces.
3. Traverse the array of words from the end.
4. Append each word to a StringBuilder.
5. Add a single space between words.
6. Return the final string.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] str = s.split("\\s+");

        StringBuilder ans = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            ans.append(str[i]);

            if (i != 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}
