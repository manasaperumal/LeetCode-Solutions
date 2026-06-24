/*
LeetCode 125 - Valid Palindrome

Topic: Strings, Two Pointers, String Manipulation

Problem:
A phrase is a palindrome if, after converting all
uppercase letters to lowercase and removing all
non-alphanumeric characters, it reads the same
forward and backward.

Return true if the given string is a palindrome,
otherwise return false.

Approach:
1. Traverse the string and keep only letters and digits.
2. Convert the filtered string to lowercase.
3. Use two pointers:
   - left starts from the beginning.
   - right starts from the end.
4. Compare characters at both pointers.
5. If any characters differ, return false.
6. If all characters match, return true.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public static boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                sb.append(ch);
            }
        }

        String result = sb.toString().toLowerCase();
        return checkPalindrome(result);
    }
}
