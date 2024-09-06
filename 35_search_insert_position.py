# 35. Search Insert Position
# Category: Binary Search
# Difficulty: Easy

class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:

        l, r = 0, len(nums) - 1

        middle = l + (r - l) // 2

        while l <= r:

            middle =  l + (r - l) // 2

            if target < nums[middle]:
                r = middle - 1
            elif target > nums[middle]:
                l = middle + 1
            else:
                return middle

        return l
        