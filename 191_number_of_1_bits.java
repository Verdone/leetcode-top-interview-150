// 191. Number of 1 Bits
// Difficulty: Easy
// Category: Bit Manipulation 

class Solution {
    public int hammingWeight(int n) {
        int a = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                a += 1;
            }
        }
        return a;        
    }
}