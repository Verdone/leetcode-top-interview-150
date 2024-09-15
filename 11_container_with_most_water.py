# 11. Container With Most Water
# Diffculty: Medium
# Category: Two Pointers

class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        maxA = 0
        
        while l < r:
            
            currA = min(height[l], height[r]) * (r - l)
            
            maxA = max(maxA, currA)
            
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        
        return maxA