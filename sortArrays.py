# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0:
            return
        low = 0
        mid = 0
        high = (len(nums) - 1)

        while mid <= high:
            if nums[mid] == 0:
                self.swap(nums, low, mid)
                low = low + 1
                mid = mid + 1
            elif nums[mid] == 2:
                self.swap(nums, high, mid)
                high = high - 1
            else:
                mid = mid + 1

    def swap(self, nums, a, b):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp