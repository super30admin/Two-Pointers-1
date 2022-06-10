""""// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""


class Solution:
    def sortColors(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums) - 1
        temp1 = 0
        temp2 = 0

        while (mid <= high):
            if nums[mid] == 1:
                mid += 1
            elif nums[mid] == 0:
                temp1 = nums[low]
                nums[low] = nums[mid]
                nums[mid] = temp1
                low += 1
                mid += 1

            elif nums[mid] == 2:
                temp2 = nums[high]
                nums[high] = nums[mid]
                nums[mid] = temp2
                high -= 1

        return nums