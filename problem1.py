# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = -1
        h = len(nums)
        i = 0
        
        while i < h:
            if nums[i] == 0:
                l += 1
                nums[i], nums[l] = nums[l], nums[i]
                i += 1
            elif nums[i] == 2:
                h -= 1
                nums[i], nums[h] = nums[h], nums[i]
                
            else:
                i += 1