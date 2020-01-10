"""
Time Complexity : O(n^2)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : none
"""

class Solution:
    def threeSum(self, nums):
        len_n = len(nums)
        res = []
        nums.sort()
        if nums == None or len_n < 3:
            return res
        
        for i in range(len_n-1):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            l = i + 1
            h = len_n - 1
            while l < h:
                sum_e = nums[i] + nums[l] + nums[h]
                if sum_e == 0:
                    res.append([nums[i], nums[l], nums[h]])
                    l += 1
                    h -= 1
                    while nums[l] == nums[l-1] and l < h:
                        l += 1
                    while nums[h] == nums[h+1] and h > l:
                        h -= 1
                elif sum_e < 0:
                    l += 1
                else:
                    h -= 1
                    
        return res
    
s = Solution()
print(s.threeSum([0,1,1]))
print(s.threeSum([-1,0,1,2,-1,-4]))