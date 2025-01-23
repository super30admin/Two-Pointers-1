
# Time Complexity: O(n)
# Space Complexity: O(1)
from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left = 0
        right = len(nums) - 1 
        middle = 0

        while  middle <= right :
            if nums[middle] == 2:
                nums[middle], nums[right] = nums[right],nums[middle]
                right = right -1
            elif nums[middle] == 0:
                nums[middle], nums[left] = nums[left], nums[middle]
                left = left +1
                middle = middle +1
            else:
                middle = middle +1
