/*
LeetCode 1295 - Find Numbers with Even Number of Digits

Topic: Arrays, Math

Problem:
Given an array nums of integers, return how many of them
contain an even number of digits.

Approach:
1. Traverse each element in the array.
2. Count the number of digits in each number by repeatedly
   dividing it by 10.
3. If the number of digits is even, increment the count.
4. Return the final count.

Time Complexity: O(n × d)
where n = number of elements and d = number of digits in each number.

Space Complexity: O(1)
*/

class Solution {
    public int findNumbers(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int numOfDigits = 0;

            while (num != 0) {
                num = num / 10;
                numOfDigits++;
            }

            if (numOfDigits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
