# Time Complexity : O(n), single pass
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES

# Any problem you faced while coding this : NO
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l,r = 0, len(nums) - 1
        m = l

        while m<=r:
            if nums[m] == 2:
                self.swap(nums, m, r)
                r -= 1
            elif nums[m] == 0:
                self.swap(nums, m, l)
                l += 1
                m += 1
            else:
                m += 1
    
    def swap(self, nums, pos1, pos2):
        temp = nums[pos1]
        nums[pos1] = nums[pos2]
        nums[pos2] = temp