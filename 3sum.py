# Did this code successfully run on Leetcode : YES

# Approach
# two pointers
# call two-sum function on every unique element in array
# TC: O(N^2)
# SC: O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        
        def get_triplet(nums, i):
            l = i + 1
            r = len(nums)-1
            while l < r:
                _sum = nums[i] + nums[l] + nums[r]
                if _sum == 0:
                    res.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -= 1
                    while l < r and nums[l] == nums[l-1]:
                        l += 1
                    while l < r and nums[r] == nums[r+1]:
                        r -= 1
                elif _sum > 0:
                    r -= 1
                else:
                    l += 1
                
        for i in range(len(nums)):
            if i == 0 or nums[i] != nums[i-1]:
                get_triplet(nums, i)
        return res