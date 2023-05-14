#Time Complexity:O(n^2)
#Space Complexity:O(1)

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result=[]    
        nums.sort()
        ans=0
        for i in range(len(nums)):
            if i>=1 and nums[i]==nums[i-1]:
                continue
            l=i+1
            h=len(nums)-1
            while(l<h):
                ans=nums[i]+nums[l]+nums[h]
                if ans==0:
                    result.append([nums[i],nums[l],nums[h]])
                    l=l+1
                    h=h-1
                    while(l<h and nums[l]==nums[l-1]):
                        l=l+1
                    while(l<h and nums[h]==nums[h+1]):
                        h=h-1
                if ans<0:
                    l=l+1
                if ans>0:
                    h=h-1
        return result