from typing import List
# Time Complexity : O(n^2), Where n is number of elements in the nums List
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nothing Specific

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        n=len(nums)
        if(n<3):
            return None
        result=[]
        #First let us sort the elements in nums
        nums.sort()
        #print(nums)
        for i in range(n):
            #This logic is also to avoid duplicates
            if(i>0 and nums[i]==nums[i-1]):
                continue
            #Here we are setting the low and high pointers
            #Here we will flow two sum approach with two pointers
            rem=0-nums[i]
            low=i+1
            high=n-1
            while(low<high):
                if(nums[low]+nums[high]<rem):
                    #Here we have to increase the sum, Therefore let us increment the low
                    low+=1
                elif(nums[low]+nums[high]>rem):
                    #Here we have to decrease the sum, Therefore let us decrement the high
                    high-=1
                else:
                    #Here we have found the triplets
                    temp=list((nums[i],nums[low],nums[high]))
                    result.append(temp)
                    #Then we should forward to find the remaining triplets
                    low+=1
                    high-=1
                    #The following logic is used to avoid the duplicates
                    while(low<high and nums[low]==nums[low-1]):
                        low+=1
                    while(low<high and nums[high]==nums[high+1]):
                        high-=1
        return result   