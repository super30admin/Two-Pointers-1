# Time complexity - O(n)
# Space complexity - O(1)

# Approach - Maintain 3 pointers for r, w, b (low, mid, and high respectively)
# Compare nums[mid] to r, w, b and keep swapping

from typing import List
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        r = 0
        w = 0
        b = len(nums) - 1

        while (w <= b):
            if nums[w] == 0:
                nums[r], nums[w] = nums[w], nums[r]
                r += 1
                w += 1            
            elif nums[w] == 1:
                w += 1            
            else:
                nums[w], nums[b] = nums[b], nums[w]
                b -= 1