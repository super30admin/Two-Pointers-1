#TC => o(n^2)
#SC => o(1) considering result array as constant

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res_ = []
        nums.sort()
        for i, a in enumerate(nums):
            if i>0 and a == nums[i-1]:
                continue
            if nums[i]>0:
                break
            l,r = i+1,len(nums)-1
            while l<r:
                threesum = a + nums[l] + nums[r]
                if threesum>0:
                    r-=1
                elif threesum<0:
                    l+=1
                else:
                    res_.append([a,nums[l],nums[r]])
                    l+=1
                    r-=1
                    while l<r and nums[l] == nums[l-1]:
                        l+=1
                    while l<r and nums[r] == nums[r+1]:
                        r-=1    
        return res_