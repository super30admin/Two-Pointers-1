"""
//Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO
"""



class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if len(nums)==0:
            return
        low = 0
        high =len(nums) - 1
        mid = 0
        while(mid<=high):
            if(nums[mid]==2):
                nums[mid],nums[high] = nums[high],nums[mid]
                high-=1
            elif(nums[mid]==1):
                mid+=1
            else:
                nums[mid],nums[low]=nums[low],nums[mid]
                low+=1
                mid+=1