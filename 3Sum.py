# Time Complexity : O(n^2)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is create a two pointers l&r and compare the sum if zero with initial for loop iteration var i with l&r, skip if duplicates.   

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums=sorted(nums)
        n=len(nums)
        res=set()
        for i in range(n-2):
            if(nums[i]>0 and nums[i]==nums[i-1]):
                continue
            l=i+1
            r=n-1
            while(l<r):
                t=nums[l]+nums[r]+nums[i]
                if(t<0):
                    l+=1
                elif(t>0):
                    r-=1
                else:
                    res.add((nums[i],nums[l],nums[r]))
                    l+=1
                    r-=1
                    while(l<r and nums[l]==nums[l-1]):
                        l+=1
                    while(l<r and nums[r]==nums[r+1]):
                        r-=1
                
        return res