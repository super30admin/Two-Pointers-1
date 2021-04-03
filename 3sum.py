# Time Complexity : O(n^2), where n is the size of the array
# Space Complexity : O(n) (required for sorting)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        nums.sort()
        result = list()

        for i, num in enumerate(nums):
            # if num > 0, the numbers cannot add to 0 since they are sorted
            if num > 0:
                return result

            # eliminate duplicate targets
            if i > 0 and num == nums[i - 1]:
                continue

            else:
                res = self.twoSum(nums, num, i + 1)
                if res:
                    result.extend(res)

        return result

    def twoSum(self, nums, num, index):
        low = index
        high = len(nums) - 1

        res = []

        while low < high:
            add = num + nums[low] + nums[high]

            if add == 0:
                res.append([num, nums[low], nums[high]])

                # eliminate duplicates
                while low + 1 <= high and nums[low + 1] == nums[low]:
                    low += 1

                low += 1
                high -= 1

            elif add < 0:
                low += 1

            else:
                high -= 1

        return res
