// LeetCode Problem #26: Remove Duplicates from Sorted Array
// Category: Array/String

class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 1;

        for (int r = 1; r < nums.length; r++) {
            if (nums[r] != nums[r - 1]) {
                nums[l] = nums[r];
                l++;
            }

        }

        return l;
    }
}