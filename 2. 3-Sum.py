import sys
class Solution:
    def threeSum(self, nums):
        # Time Complexity - O(n^2)
        # Space Complexity - O(1) as we're returning the output array
        nums.sort()
        result = []

        for i in range(len(nums) - 2):
            if (i != 0 and nums[i] == nums[i - 1]):
                continue
            l = i + 1
            r = len(nums) - 1

            while l < r:
                if nums[i] + nums[l] + nums[r] == 0:
                    result.append([nums[i], nums[l], nums[r]])
                    while (l < r) and (nums[l] == nums[l + 1]):
                        l += 1
                    while (l < r) and (nums[r] == nums[r - 1]):
                        r -= 1
                    l += 1
                    r -= 1

                elif nums[i] + nums[l] + nums[r] < 0:
                    l += 1
                else:
                    r -= 1
        return set([tuple(x) for x in result])