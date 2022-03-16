#  Time Complexity : O(n*n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        ans = set()
        if len(nums) == 0 or len(nums) == 1 or len(nums) == 2:
            return ans
        nums.sort()
        for i in range(len(nums)):
            j = i+1
            k = len(nums)-1
            while j<k:
                sums = nums[i] +nums[j] +nums[k]
                if sums == 0:
                    ans.add((nums[i],nums[j],nums[k]))
                    j += 1
                elif sums < 0:
                    j += 1
                else:
                    k -= 1
        return ans
                    
                    
            
        
        