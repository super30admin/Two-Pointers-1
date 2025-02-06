# Time Complexity : O(n^2) - n is length of nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
We take one element at a time and then do two sum on rest of the elements using two pointer.
"""


class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        n = len(nums)
        result = []
        nums.sort()

        for i in range(0, n - 2):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            l = i + 1
            r = n - 1

            while l < r:
                sum = nums[l] + nums[r] + nums[i]
                if sum == 0:
                    lst = [nums[i], nums[l], nums[r]]
                    result.append(lst)
                    l += 1
                    r -= 1
                    while l < r and nums[l - 1] == nums[l]:
                        l = l + 1

                    while l < r and nums[r] == nums[r + 1]:
                        r = r - 1

                elif sum > 0:
                    r = r - 1
                else:
                    l = l + 1
        return result





