// Time Complexity :o(n^2)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : Time limit exceed
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        d=set()
        res=[]
        for i in range(len(nums)-2):
            for j in range(i+1,len(nums)-1):
                for k in range(j+1,len(nums)):
                    sum=nums[i]+nums[j]+nums[k]
                    if sum==0:
                        t = tuple(sorted([nums[i], nums[j], nums[k]]))
                        d.add(t)
                        res=list(d)
        return res
