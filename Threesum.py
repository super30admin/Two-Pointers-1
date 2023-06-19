# // Time Complexity :O(N)
# // Space Complexity :O(N)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :no
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res=[]
        nums.sort()
        for i,val in enumerate(nums):
            if (i > 0 and val==nums[i-1]):
                continue
            l,r=i+1,len(nums)-1
            while(l<r):
                sum=val+nums[l]+nums[r]
                if(sum>0):
                    r-=1
                elif(sum<0):
                    l+=1
                else:
                    res.append([val,nums[l],nums[r]])
                    l+=1
                    while(nums[l] == nums[l-1] and l < r):
                        l+=1
        return res




