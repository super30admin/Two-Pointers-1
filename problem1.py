# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = 0
        r = len(nums) - 1
        i = 0
        while i <= r:
            if nums[i] == 2:
                self.swap(nums,i,r)
                r -= 1
            elif nums[i] == 1:
                i += 1
            else:
                self.swap(nums,l,i)
                l += 1
                i += 1
    def swap(self,nums,a,b):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp