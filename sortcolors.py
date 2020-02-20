# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Couldn't figure out a one pass solution :(


# Your code here along with comments explaining your approach

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        r = 0
        w = 0
        b = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                r +=1
            if nums[i] == 1:
                w +=1   
            if nums[i] == 2:
                b +=1
        i =0
        while i < r:
            nums[i] = 0
            i = i+1
        while i < r+w:
            nums[i] = 1
            i = i+1
        while i < r+w+b:
            nums[i] = 2
            i = i+1
            
            
                    
        
            
        