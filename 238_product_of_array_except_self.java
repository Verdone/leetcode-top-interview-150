// 238. Product of Array Except Self
// Difficulty: Medium
// Category: Array / String

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];
        Arrays.fill(a, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            a[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            a[i] *= curr;
            curr *= nums[i];
        }
        return a;
    }
}