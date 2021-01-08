#Time Complexity :O(n^2)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this : tried running sum.
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if(len(nums)==0 or nums==None):
            return []
        ans=[]
        nums.sort()
        for i in range(len(nums)-2):
            if(nums[i]>0):
                break
            if(i>0 and nums[i]==nums[i-1]):
                continue
            low=i+1
            high=len(nums)-1
            while(low<high):
                summ=nums[low]+nums[high]+nums[i]
                if(summ==0):
                    arr=[nums[i],nums[low],nums[high]]
                    ans.append(arr)
                    low+=1
                    high-=1
                    while(low<high and nums[low]==nums[low-1]):
                        low+=1
                    while(low<high and nums[high]==nums[high+1]):
                        high-=1
                elif(summ>0):
                    high-=1
                else:
                    low+=1
        return ans
                    
                    