// 136. Single Number
// Difficulty: Easy
// Category: Bit Manipulation

class Solution {
    public int singleNumber(int[] nums) {
        int a = 0; 
        for(int i = 0; i < nums.length; i++){ a ^= nums[i];}
        return a;
    }
}