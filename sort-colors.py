# Time Complexity : O(n) - n is length of nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
use 3 pointers
"""

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """

        n = len(nums)
        l = 0
        mid = 0
        r = n-1

        while mid<=r:
            if nums[mid] == 2:
                nums[mid],nums[r] = nums[r],nums[mid]
                r = r-1
            elif nums[mid] == 0:
                nums[mid],nums[l] = nums[l],nums[mid]
                l=l+1
                mid=mid+1
            else:
                mid=mid+1