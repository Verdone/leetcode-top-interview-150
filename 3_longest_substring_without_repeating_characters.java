// 3. Longest Substring Without Repeating Characters
// Difficulty: Medium
// Category: Sliding Window

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        int[] i = new int[128];
        
        for (int strt = 0, end = 0; end < n; end++) {
            char curr = s.charAt(end);
            strt = Math.max(strt, i[curr]);
            max = Math.max(max, end - strt + 1);
            i[curr] = end + 1;
        }
        
        return max;
    }
}