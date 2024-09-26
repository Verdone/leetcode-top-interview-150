// 219. Contains Duplicate II
// Difficulty: Easy
// Category: Hashmap

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashSet<Integer> h = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (h.contains(nums[i])) {
                return true;
            }

            h.add(nums[i]);

            if (h.size() > k) {
                h.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}
