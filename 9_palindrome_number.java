// LeetCode Problem #9: Palindrome Number
// Category: Math

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int c = x, y = 0; // where c is a copy of x used in the loop, and y will be the reversed number of x

        while(c != 0) {
            int r = c % 10; // remainder
            y = y * 10 + r;

            // remove the last digit from c
            c /= 10;
        }

        if (y == x) return true;

        return false;
    }
}