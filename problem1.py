"""
// Time Complexity : O( N)  N number of elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        l = 0
        h = len(nums) - 1
        m = 0
        while m <= h:
            if nums[m] == 2:
                t = nums[h]
                nums[h] = nums[m]
                nums[m] = t
                h -= 1
            elif nums[m] == 0:
                t = nums[l]
                nums[l] = nums[m]
                nums[m] = t
                l += 1
                m += 1
            elif nums[m] == 1:
                m += 1
