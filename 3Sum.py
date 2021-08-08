"""
Time Complexity : O(n^2)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 0:
            return []
        result = []
        # Sorting the array first so that we can use two pointers
        nums.sort()
        # Looping through the array with the first element as pivot
        # and second as low and last element as high. We append the nums
        # if they are equal to 0 else we increment or decrement low/high pointers
        # accordingly.
        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i - 1]: continue
            low = i + 1
            high = len(nums) - 1
            while low < high:
                targetSum = nums[i] + nums[low] + nums[high]
                if targetSum == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low - 1]: low += 1
                    while low < high and nums[high] == nums[high + 1]: high -= 1
                elif targetSum > 0:
                    high -= 1
                else:
                    low += 1
        return result