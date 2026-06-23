/*
LeetCode 345 - Reverse Vowels of a String

Topic: Strings, Two Pointers

Problem:
Given a string s, reverse only the vowels in the string
and return the resulting string.

The vowels are:
'a', 'e', 'i', 'o', 'u' and their uppercase forms.

Approach:
1. Convert the string into a character array.
2. Use two pointers:
   - start from the beginning.
   - end from the last index.
3. Move the start pointer forward until a vowel is found.
4. Move the end pointer backward until a vowel is found.
5. Swap the vowels at both pointers.
6. Continue until the pointers meet.
7. Convert the character array back to a string.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        String vowels = "AEIOUaeiou";

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            while (start < end && vowels.indexOf(chars[start]) == -1) {
                start++;
            }

            while (start < end && vowels.indexOf(chars[end]) == -1) {
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
