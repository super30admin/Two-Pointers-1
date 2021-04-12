# -*- coding: utf-8 -*-
"""
Created on Mon Apr 12 11:37:48 2021

@author: jgdch
"""

#Time Compleixty: O(N**2), N is the length of input 
#Space complexity:O(1)
#All lc testcases passed

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if(len(nums)<3):
            return []
        nums.sort()
        res=[]
        for i in range(len(nums)-2):
            low=i+1
            high=len(nums)-1
            if(i>0 and nums[i-1]==nums[i]):
               continue
            while(low<high):
                sum=nums[i]+nums[low]+nums[high]
                if(sum==0):
                    res.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    while(low < high and nums[low] == nums[low-1]) :
                        low+=1

                    while(low < high and nums[high] == nums[high + 1]) :
                        high-=1
                elif(sum<0):
                    low+=1
                else:
                    high-=1
        
        
        return res