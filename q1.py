from typing import List
# Time Complexity : O(n), Where n is number of elements in nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nothing specific

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #Here we will use three variables for low,mid,high which are used for postioning 0,1,2 respectively
        low=0
        mid=0
        high=len(nums)-1
        while(mid<=high):
            if(nums[mid]==2):
                #Here we have to swap mid with the last element and decrement the high
                
                nums[mid],nums[high]=nums[high],nums[mid]#Swap
                high-=1
            elif(nums[mid]==1):
                #Here we don't have to swap the element, Just increment the mid
                mid+=1
            else:
                #Here we have to swap mid with the first element and increment the low,mid
                
                nums[mid],nums[low]=nums[low],nums[mid]#swap
                mid+=1
                low+=1
                
            
    