# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(n)
# Space Complexity : Average : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : was increasing the mid index even in case when nums[m]==2

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        - Use the dutch flag problem solution
        - three pointers are used: left, right and mid
        - the mid pointer will compare at each point and accordingly swap to l and r
        """
        l = 0
        m = 0
        r = len(nums) - 1
        while m <= r:
            if nums[m] == 1:
                m += 1
            elif nums[m] == 0:
                nums[l], nums[m] = nums[m], nums[l]
                l += 1
                m += 1
            elif nums[m] == 2:
                nums[r], nums[m] = nums[m], nums[r]
                r -= 1