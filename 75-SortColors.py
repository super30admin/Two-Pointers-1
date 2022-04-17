#Time Complexity : O(n) 
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0:
            return

        l = 0
        h = len(nums) - 1
        m = 0

        while m <= h:
            if nums[m] == 2:
                Solution.swap(nums,m,h)
                h = h - 1
            elif nums[m] == 0:
                Solution.swap(nums,m,l)
                l = l + 1
                m = m + 1
            else:
                m = m + 1
        return nums
    
    
    def swap(nums,m,h):
        temp = nums[m]
        nums[m] = nums[h]
        nums[h] = temp