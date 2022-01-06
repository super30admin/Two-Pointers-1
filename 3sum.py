# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        result = set()  # to store the final value

        if len(nums) < 3:
            return result

        nums.sort()  # sorting the array

        # iterating through the loop
        for i in range(len(nums) - 2):
            # to check if the current value is greater than 0
            # and if current value is equal to previous value
            if (i > 0 and nums[i] == nums[i - 1]):
                continue

            # we will call 2sum approach below to continue

            low = i + 1  # setting low pointer
            high = len(nums) - 1  # setting high pointer

            while(low < high):

                # storing the summ of high low and i in sum_val
                sum_val = nums[i] + nums[low] + nums[high]

                if (sum_val == 0):  # if sum_val is equal to 0, we found a triplet

                    result.add((nums[i], nums[low], nums[high]))

                    # Avoiding duplicacy
                    low = low + 1
                    high = high - 1

                elif sum_val > 0:
                    high = high - 1

                else:  # if sum_val < 0
                    low = low + 1

        return result
