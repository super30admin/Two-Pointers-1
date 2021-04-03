# Time Complexity : O(n), where n is the size of the array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # low keeps track of the place where 0 needs to be inserted
        # high keeps track of the place where 2 needs to be inserted
        # mid keeps track of the 1s

        low, mid = 0, 0
        high = len(nums) - 1

        while mid <= high:
            if nums[mid] == 1:
                mid += 1

            elif nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1

            else:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1
