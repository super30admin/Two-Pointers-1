# Time complexity: O(n*n) where n is the length of the array.
# Space complexity: O(1).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 0: return []
        # Two pointer Solution
        result = []
        nums.sort()
        for i in range(len(nums)):      # One value is fixed.
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            left = i + 1
            right = len(nums) - 1
            while left < right:
                sum = nums[i] + nums[left] + nums[right]
                if sum < 0:         # Smaller elements are to the left.
                    left += 1
                elif sum > 0:       # Bigger elements are to the right.
                    right -= 1
                else:
                    arr = (nums[i], nums[left], nums[right])
                    result.append(arr)
                    left += 1           # Move to get a new pair of values.
                    right -= 1
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1
        return result   
        
        # Brute Force Method
        # TC: O(n ^ 3)
        # SC: O(1)
        # result = []
        # h_set = set()
        # for i in range(len(nums) - 2):
        #     for j in range(i + 1, len(nums) - 1):
        #         for k in range(j + 1, len(nums)):
        #             sum = nums[i] + nums[j] + nums[k]
        #             if sum == 0:
        #                 arr = [nums[i], nums[j], nums[k]]
        #                 arr.sort()
        #                 arr = tuple(arr)
        #                 if arr not in h_set:
        #                     h_set.add(arr)
        #                     result.append(arr)
        # return result