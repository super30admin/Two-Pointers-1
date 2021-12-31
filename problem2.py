# Time Complexity : O(n^2)
# Space Complexity:o(1)
#  Did this code successfully run on Leetcode : Yes

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if nums is None or len(nums) == 0:
            return []

        result = []
        n = len(nums)
        nums.sort()

        for i in range(0, n - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            if nums[i] > 0:
                break

            low = i + 1
            high = n - 1

            while low < high:
                sum = nums[i] + nums[low] + nums[high]

                if sum == 0:
                    li = nums[i], nums[low], nums[high]
                    result.append(li)
                    low += 1
                    high -= 1

                    while low < high and nums[low] == nums[low - 1]:
                        low += 1

                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1

                elif sum > 0:
                    high -= 1
                else:
                    low += 1
        return result
