# Time Complexity : O(nlogn)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES

# Any problem you faced while coding this : NO

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort(key = lambda x:x)
        
        prev = float('inf')
        for ix, num in enumerate(nums[:-2]):
            if prev == num:
                continue
            target = -num
            int_res = self.twoSum(nums[ix+1:], target)
            if int_res:
                for num1, num2 in int_res:
                    res.append([num, num1, num2])
            prev = num
        
        return res
    
    def twoSum(self, nums, target):
        l,r = 0, len(nums) - 1
        res = []
        while l < r:
            cu_sum = nums[l] + nums[r]
            if cu_sum > target:
                r -= 1
            elif cu_sum < target:
                l += 1
            else:
                res.append([nums[l], nums[r]])
                l += 1
                while l != len(nums)-1 and nums[l-1] == nums[l]:
                    l += 1
        return res