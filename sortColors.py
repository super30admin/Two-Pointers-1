"""
Three pointers approach - practice
TC - O(n)
SC - O(1)
"""


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0: return []

        n = len(nums)
        low = 0
        high = n - 1
        mid = 0

        while mid <= high:
            # mid since when mid crosses high, breach occurs or the elements are already sorted by then
            if nums[mid] == 2:
                self.swap(nums, mid, high)
                high -= 1
            elif nums[mid] == 0:
                self.swap(nums, mid, low)
                low += 1
                mid += 1
            else:
                mid += 1

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
