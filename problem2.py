# Time Complexity : O(n*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []
        i=0
        while i < len(nums):
            if (i != 0 and nums[i] == nums[i-1]):
                i += 1
                continue
                
            l = i + 1 
            r = len(nums)-1
            while l < r:
                currentSum =  nums[i] + nums[l] + nums[r]
                if currentSum == 0:
                    result.append([nums[i],nums[l],nums[r]])
                    l += 1
                    r -= 1
                    while l < r and nums[l] == nums[l-1]:
                        l += 1
                    while l < r and nums[r] == nums[r+1]:
                        r -= 1
                elif currentSum < 0:
                    l += 1
                else:
                    r -= 1
            i += 1
        return result