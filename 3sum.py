##Time Complexity : O(n^2)
##Space Complexity :O(1)
##Did this code successfully run on Leetcode : Yes
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = []
        nums.sort()
        for i, a in enumerate(nums):
            if i > 0 and a == nums[i-1]:
                continue
            l, r = i+1, len(nums) - 1
            while l<r:
                threeSum = a+nums[l] + nums[r]
                if threeSum >0:
                    r -= 1
                elif threeSum < 0:
                    l += 1
                else:
                    result.append([a, nums[l], nums[r]])
                    l += 1
                    while nums[l] == nums[l-1] and l<r:
                        l+=1
        return result
        