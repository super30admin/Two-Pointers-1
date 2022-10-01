# Time Complexity: O(n**2)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No


class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = set()
        nums.sort()
        
        for i in range(0, len(nums)):
            if i>0 and nums[i] == nums[i-1]:
                continue
            l = i+1
            r = len(nums) - 1
            while(l<r):
                s = nums[i] + nums[l] + nums[r]
                if s<0:
                    l+=1
                elif s>0:
                    r-=1
                else:
                    res.add((nums[i], nums[l], nums[r]))
                    l+=1
                    while(l<r and nums[l]==nums[l-1]):
                        l+=1
        return res
            