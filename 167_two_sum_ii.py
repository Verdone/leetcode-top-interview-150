# LeetCode Problem #88: Merge Sorted Array
# Category: Two Pointers

from typing import List


class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        
        p1, p2 = 0, len(numbers) - 1

        for i in numbers:
            if numbers[p1] + numbers[p2] > target:
                p2 -= 1
            elif numbers[p1] + numbers[p2] < target:
                p1 += 1
            else:
                break   

        return [p1 + 1, p2 + 1]