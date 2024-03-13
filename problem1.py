# https://leetcode.com/problems/sort-colors/description/

# Time Complexity : O(N) is number of elements in the array.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

# Your code here along with comments explaining your approach.
# Approach - We have to maintain three pointers. One mid-pointer to keep moving from left to right the array.
# One left pointer on left most side and right pointer on right most side
# Left moves one step towards right at a time whenever we find a 0 on the mid.
# Right moves one step towards left at a time whenever we find 2 on the mid
# If mid-pointer moves over left then we stop.


from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low, mid, high = 0, len(nums) - 1, len(nums) - 1
        while mid >= low:
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
                mid -= 1
            elif nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1
            else:
                mid -= 1
