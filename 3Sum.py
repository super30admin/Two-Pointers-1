# // Time Complexity : O(n*2)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        size = len(nums)
        result = []
        for i in range(size-1):

            if i > 0 and nums[i-1] == nums[i]:
                continue

            element = nums[i]
            target_sum = element * -1
            left = i + 1
            right = size - 1

            while left < right:
                curr_sum = nums[left] + nums[right]

                if curr_sum < target_sum:
                    left += 1

                elif curr_sum > target_sum:
                    right -= 1

                else:
                    result.append([element, nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while(left < right and nums[left] == nums[left - 1]):
                        left += 1
                    while(left < right and nums[right] == nums[right + 1]):
                        right -= 1

        return result
