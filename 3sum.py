# // Time Complexity : O(n^2) 
# // Space Complexity : O(n)   
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : not much i attended the class and then did it.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            l = i + 1
            r = len(nums) - 1

            while (l < r):
                total = nums[i] + nums[l] + nums[r]
                if total == 0:
                    result.append((nums[i],nums[l],nums[r]))
                    l +=1
                    r -= 1
                    while (l < r and nums[l] == nums[l-1]):
                        l += 1
                    while (l < r and nums[r] == nums[r+1]):
                        r -= 1 
                elif total < 0:
                    l += 1
                else:
                    r -= 1 
        
        return result
    
# Approach:
# I took one elemnt at a time(target) and then for the rest of the array i applied 2sum.