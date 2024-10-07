class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        for i,n in enumerate(nums):
            if i> 0 and nums[i] == nums[i-1]:
                continue
            l = i+1
            r = len(nums) - 1
            while l<r:
                threesum = n + nums[l] + nums [r]
                if threesum < 0:
                    l+=1
                elif threesum > 0:
                    r-=1
                else:
                    res.append([n,nums[l],nums[r]])
                    l +=1
                    while (nums[l] ==nums[l-1] and l<r):
                        l +=1
        return res