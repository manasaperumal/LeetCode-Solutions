/*
LeetCode 2798 - Number of Employees Who Met the Target

Topic: Arrays

Problem:
Given an array hours where hours[i] represents the number
of hours worked by the ith employee and an integer target,
return the number of employees who worked at least target hours.

Approach:
1. Initialize a counter to 0.
2. Traverse the hours array.
3. If hours[i] >= target, increment the counter.
4. Return the counter.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                count++;
            }
        }

        return count;
    }
}
