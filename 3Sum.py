# Tc: O(n)
# SC: O(n)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        
        for i,a in enumerate(nums):
            if i>0 and nums[i] == nums[i-1]:
                continue
            target = -nums[i]
            l,r = i+1 , len(nums) -1
            
        
            while l<r:
                
                summ = 0
                summ = nums[l] + nums[r]
                if summ == target:
                    res.append([nums[i],nums[l],nums[r]])
                    l +=1
                    while(nums[l] == nums[l-1]) and l<r:
                        l +=1
                if summ > target:
                    r = r- 1
                if summ < target:
                    l += 1
        return res
