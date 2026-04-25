# time O(n^2), space O(1)
class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:

        res=[]
        for i in range(len(nums)):
            #outside duplicacy
            if i != 0 and nums[i] == nums[i-1]:
                continue
            a = nums[i]
            l=i+1
            r=len(nums)-1
            while l < r:
                three = a+nums[l]+nums[r]
                if three > 0:
                    dp = nums[r]
                    while nums[r] == dp and r > l:
                        r-=1
                else: 
                    if three == 0:
                        res.append([nums[i],nums[l],nums[r]])
                    # if three less than 0 or three == 0, move left pointer
                    dup = nums[l]
                    while nums[l] == dup and l < r:
                        l+=1
     
        return res
