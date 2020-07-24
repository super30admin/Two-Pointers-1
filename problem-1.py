"""
Approach

1. Take 2 pointers, low and high pointing the starting and ending of the array
2. The low pointer makes sure that the numbers before it are 0s and the high pointer makes sure that the numbers after it are 2s
3. we iterate the array and if we find 0 or 2 then we swap with low or high pointers accordingly, if we encounter a 1 then we just skip it because we already made sure that 1 is in proper position

"""


# Time Complexity : O(n) 
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        def mySwapfunction(nums,i,j):
            nums[i],nums[j] = nums[j],nums[i]
        
        low = 0
        mid = 0
        high = len(nums)-1
        
        while(mid<=high):
            if nums[mid]==1:
                mid+=1
            elif nums[mid]==0:
                mySwapfunction(nums,low,mid)
                low+=1
                mid+=1
            else:
                mySwapfunction(nums,high,mid)
                high-=1