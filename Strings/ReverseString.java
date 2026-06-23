/*
LeetCode 344 - Reverse String

Topic: Strings, Two Pointers

Problem:
Given a character array s, reverse the array in-place.
You must modify the input array using O(1) extra memory.

Approach:
1. Use two pointers:
   - i starts at the beginning of the array.
   - j starts at the end of the array.
2. Swap the characters at i and j.
3. Move i forward and j backward.
4. Continue until i >= j.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}
