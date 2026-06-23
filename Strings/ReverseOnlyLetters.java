/*
LeetCode 917 - Reverse Only Letters

Topic: Strings, Two Pointers

Problem:
Given a string s, reverse only the English letters.
All non-letter characters must remain in their original positions.

Approach:
1. Convert the string into a character array.
2. Use two pointers:
   - start from the beginning.
   - end from the last index.
3. Move the start pointer forward until a letter is found.
4. Move the end pointer backward until a letter is found.
5. Swap the letters at both pointers.
6. Continue until the pointers meet.
7. Convert the character array back to a string.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String reverseOnlyLetters(String S) {
        int start = 0;
        int end = S.length() - 1;

        char[] chars = S.toCharArray();

        while (start < end) {
            while (start < end && !Character.isLetter(chars[start])) {
                start++;
            }

            while (start < end && !Character.isLetter(chars[end])) {
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);
    }
}
