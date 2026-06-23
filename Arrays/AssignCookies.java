/*
LeetCode 455 - Assign Cookies

Topic: Arrays, Greedy, Sorting

Problem:
Each child has a greed factor g[i], and each cookie has
a size s[j]. A child is content if the assigned cookie
size is greater than or equal to the child's greed factor.

Return the maximum number of content children.

Approach:
1. Sort both the greed array and the cookie array.
2. Use two pointers:
   - i for children
   - j for cookies
3. If the current cookie can satisfy the current child,
   assign it and move both pointers.
4. Otherwise, try the next larger cookie.
5. The number of satisfied children is stored in i.

Time Complexity: O(n log n + m log m)
Space Complexity: O(1)
where:
n = g.length
m = s.length
*/

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        return i;
    }
}
