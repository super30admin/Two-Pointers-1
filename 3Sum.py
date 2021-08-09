"""
//Time Complexity : O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO
"""



class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums)==0:
            return []
        result = []
        nums.sort()
        for i in range(0,len(nums)):
            if nums[i]>0:
                break
            if (i!=0 and nums[i]==nums[i-1]):
                continue
            low = i+1
            high = len(nums) - 1
            while(low<high):
                sum1=nums[i]+nums[low]+nums[high]
                if sum1==0:
                    result.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    while(low<high and nums[low]==nums[low-1]):
                        low+=1
                    while(low<high and nums[high]==nums[high+1]):
                        high-=1
                elif sum1<0:
                    low+=1
                else:
                    high-=1
        return result
                    
 
                    