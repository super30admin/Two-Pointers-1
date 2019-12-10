# Time Complexity : O(n**2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Unique values in result list

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        # print(nums)
        retList = []
        for i in range(len(nums)-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            left = i + 1
            right = len(nums) - 1
            while left < right:
                summ = nums[i] + nums[left] + nums[right]
                # print(summ)
                if summ < 0:
                    left += 1
                elif summ > 0:
                    right -= 1
                else:
                    retList.append([nums[i], nums[left], nums[right]])
                    while left < right and nums[left] == nums[left + 1]:
                        left = left + 1
                    while left < right and nums[right] == nums[right - 1]:
                        right = right - 1
                    left += 1
                    right -= 1
        return retList