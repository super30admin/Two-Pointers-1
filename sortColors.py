"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : none
"""

class Solution:
    def sortColors(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        len_n = len(nums)
        if nums == None or len_n == 0:
            return
        
        l = 0
        m = 0
        h = len_n - 1
        
        while m <= h:
            if nums[m] == 0:
                self.swap(nums, m, l) 
                l += 1
                m += 1
            elif nums[m] == 1:
                m += 1
            else:
                self.swap(nums, m, h)
                h -= 1
    
    # this function is not the pythonic way to swap, however pythonic way is much slower         
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        # Pythonic way: nums[i], nums[j] = nums[j], nums[i]   
               
s = Solution()
nums = [2,0,2,1,1,0]
print(nums)
s.sortColors(nums)
print(nums)