# 75. Sort Colors
"""
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


using 3 pointers. mid, low, high.
mid will be responsible to store 1s in their respective position.
low for 0s and high for 2s.

"""


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # base

        # logic
        low = 0
        mid = 0
        high = len(nums) - 1

        while (mid <= high):

            # checking for color 0
            # if we encounter 0, then its should be associated with low. Threfore, swap them.
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1

            # checking for color 1
            # if we encounter 1, then its should be associated with mid. Threfore, no swap because we are keeping track of mid itself here.
            elif nums[mid] == 1:
                mid += 1

            # checking for color 2
            # if we encounter 2, then its should be associated with high. Threfore, swap them.
            # mid is not incremented here because we do not know what value comes from high.(0 or 1)
            elif nums[mid] == 2:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1

        print(nums)