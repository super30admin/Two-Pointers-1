# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        x = 0
        n = len(nums)
        nums.sort()
        result = []
        while(x<n):
            l = x+1
            r = n-1
            
            while(l<r):
                total = nums[x] + nums[l] + nums[r]
                if total == 0:
                    result.append([nums[x], nums[l], nums[r]])
                
                if total <= 0:
                    l += 1
                    while(l < r and nums[l]==nums[l-1]):
                        l += 1
                else:
                    r -= 1
                    while(l < r and nums[r]==nums[r+1]):
                        r -= 1
            x += 1
            while(x < l and nums[x]==nums[x-1]):
                x += 1
                
        return result