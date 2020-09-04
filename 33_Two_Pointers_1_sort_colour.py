#Time Complexity : O(n) 
#Space Complexity : O(1) 
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : 

#Your code here along with comments explaining your approach

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        
        left=0
        cur=0
        right=len(nums)-1
        
        while cur<=right: 
            if nums[cur]==0: 
                nums[left],nums[cur]=nums[cur],nums[left]
                left+=1
                cur+=1
            elif nums[cur]==1: 
                cur+=1
            else: 
                nums[cur], nums[right]=nums[right],nums[cur]
                right-=1
                