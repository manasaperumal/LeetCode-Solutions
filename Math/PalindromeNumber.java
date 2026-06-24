/*
LeetCode 9 - Palindrome Number

Topic: Math, Number Manipulation

Problem:
Given an integer x, return true if x is a palindrome,
and false otherwise.

A palindrome number reads the same forward and backward.

Approach:
1. Store the original number in a temporary variable.
2. Reverse the digits of the number.
3. Compare the reversed number with the original number.
4. If both are equal, return true.
5. Otherwise, return false.

Time Complexity: O(log10 n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int sum = 0;

        while (x > 0) {
            int r = x % 10;
            sum = (sum * 10) + r;
            x = x / 10;
        }

        return sum == temp;
    }
}
