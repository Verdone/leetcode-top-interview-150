// 452. Minimum Number of Arrows to Burst Balloons
// Difficulty: Medium
// Category: Intervals

class Solution {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        
        int ct = 1;
        int prev = points[0][1];
        
        for (int i = 1; i < points.length; ++i) {
            if (points[i][0] > prev) {
                ct++;
                prev = points[i][1];
            }
        }
        
        return ct;
    }
}