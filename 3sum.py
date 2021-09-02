# Time Complexity : O(N^2), sorting and looping twice
# Space Complexity : O(1), no auxiliary DS
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        triplets = set()
        targetSum = 0
        for i in range(len(nums)-2):
            j = i+1
            k = len(nums)-1
            while j<k:
                currentSum = nums[i] + nums[j] + nums[k]
                if currentSum == targetSum:
                    triplets.add((nums[i],nums[j],nums[k]))
                    j += 1
                    k -= 1
                elif currentSum < targetSum:
                    j += 1
                elif currentSum >targetSum:
                    k -=1
        return triplets
            