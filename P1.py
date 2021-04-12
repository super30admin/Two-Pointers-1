# -*- coding: utf-8 -*-
"""
Created on Mon Apr 12 11:36:18 2021

@author: jgdch
"""

#Time complxity: O(N), where N is the length of the input list
#Space Complexity: O(1)
#All test cases passed on leetcode
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        low=0
        high=len(nums)-1
        mid=0
        
        while(mid<=high):
            
            if(nums[mid]==1):
                mid+=1
            elif(nums[mid]==0):
                nums[mid],nums[low]=nums[low],nums[mid]
                low+=1
                mid+=1
            else:
                nums[mid],nums[high]=nums[high],nums[mid]
                
                high-=1
                            
        