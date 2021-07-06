"""
// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

"""
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        start = 0
        end = len(nums) - 1
        mid = 0 #keeps track of 1's
        while mid <= end:
            if nums[mid] == 0: #start pointer keeps track of position where 0 is to be placed
                nums[mid],nums[start] = nums[start],nums[mid] 
                start += 1
                mid+=1
            elif nums[mid] == 2: #end pointer keeps track of position where 2 is to be placed
                nums[mid],nums[end] = nums[end],nums[mid]
                end -= 1
            else:
                mid += 1 
                
        