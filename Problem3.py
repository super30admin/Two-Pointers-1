# Time Complexity : O(nlog+n^2)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        nums.sort()
        array=[]
        arr=[]
        for i in range(n-2):
            low=i+1
            high=n-1
            #avoiding duplicates
            if i!=0 and nums[i]==nums[i-1]:
                continue
            if nums[i]>0:
                break
            while low<high:
                sum=nums[i]+nums[low]+nums[high]
                if sum==0:
                    arr=[nums[i],nums[low],nums[high]]
                    array.append(arr)
                    low+=1
                    high-=1
                    #avoiding duplicates
                    while low<high and nums[low]==nums[low-1]:
                        low+=1
                    #avoiding duplicates
                    while low<high and nums[high]==nums[high+1]:
                        high-=1 
                elif sum<0:
                    low+=1
                else:
                    high-=1
        return array
