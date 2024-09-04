// 70. Climbing Stairs
// Category: 1D DP
// Difficulty: Easy

class Solution {
    public int climbStairs(int n) { // Using a bottom-up DP approach
        
        int a = 1, b = 1;

        for (int i = 0; i < (n - 1); i++) {
            int t = a;
            a = a + b;
            b = t;
        }

        return a;
    }
}