from typing import List
class Solution:
    def sortColors(self, nums: List[int]) -> List[int]:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0: return

        low, mid, height = 0, 0, len(nums) - 1

        while (mid <= height):
            if nums[mid] == 1:
                mid += 1
            elif nums[mid] == 0:
                self.swap(nums=nums, left=low, right=mid)
                low += 1
                mid += 1
            elif nums[mid] == 2:
                self.swap(nums=nums, left=mid, right=height)
                height -= 1

        return nums

    def swap(self, nums: List[int], left: int, right: int) -> None:

        temp = nums[left]
        nums[left] = nums[right]
        nums[right] = temp



        # time:-o(n) where n =height-mid
        # space:-O(1)