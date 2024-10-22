// 190. Reverse Bits
// Difficulty: Easy
// Category: Bit Manipulation

public class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < Integer.SIZE; i++) {
            res = res << 1;
            if ((n & 1) > 0) {
                res = res ^ 1;
            }
            n = n >> 1;
        }
        return res;
    }
}