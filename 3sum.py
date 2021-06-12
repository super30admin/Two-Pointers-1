from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result=[]
        if len(nums)==0:
            return result
       
        #2pointer solution with space complexity O(1)
        """
        Start from 0th index of array, considering it as pivot. 
        Left pointer =start at pivot+1
        Right pointer start at end of array
        """
        n=len(nums)
        nums.sort()
        for i in range(n):
            #handle outer duplicacy i=pivot=outer index
            if (i!=0 and nums[i]==nums[i-1]):
                continue   #do nothing
            low=i+1
            high=n-1
            while (low<high):
                if nums[i]+nums[low]+nums[high]==0: #triplet found
                    result.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    #inner duplicacy
                    while(low<n and nums[low]==nums[low-1]):
                        low+=1
                    while(high>=0 and nums[high]==nums[high+1]):
                        high-=1
                elif nums[i]+nums[low]+nums[high]>0:
                    high-=1
                else:
                    low+=1

        return result




