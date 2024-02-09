# Time complexity is O(n) we iterate just once over array
# Space complexity is O(1) we do not use any space
class Solution:
    def sortColors(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # In this problem I have used m as pivot to check value and swap with particular pointer
        # m move and swap with other pointers
        l = 0
        m = 0
        h = len(nums) - 1
        while (m <= h):
            if nums[m] == 2:
                self.swap(nums, m, h)
                h -= 1
            if nums[m] == 0:
                self.swap(nums, m, l)
                m += 1
                l += 1
            elif nums[m] == 1:
                m += 1

    def swap(self, nums, i, j):
        nums[i], nums[j] = nums[j], nums[i]
