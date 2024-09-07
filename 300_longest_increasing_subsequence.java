// 300. Longest Increasing Subsequence
// Category: 1D DP
// Difficulty: Medium

public class Solution {
    public int lengthOfLIS(int[] nums) {

        int n = nums.length;
        int[] cache = new int[n];
        Arrays.fill(cache, 1);

        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] > nums[j]) {
                    cache[i] = Math.max(cache[i], cache[j] + 1);
                }
            }
        }

        int maxLength = Arrays.stream(cache).max().orElse(0);
        return maxLength;
    }
}