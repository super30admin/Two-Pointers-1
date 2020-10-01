// Time Complexity : O(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
       
        nums.sort()
        res = []
        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i-1]: continue
            target = -nums[i]
            l, r = i+1, len(nums)-1
            
            while l < r:
                if nums[l] + nums[r] == target:
                    
                    res.append((nums[i], nums[l], nums[r]))
                    while l < r and nums[l] == nums[l+1]: l += 1
                    while l < r and nums[r] == nums[r-1]: r -= 1
                    l += 1
                    r -= 1
               
                elif nums[l] + nums[r] < target:  
                    l += 1
                  
                else:
                    r -= 1
        return res