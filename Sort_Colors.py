#Time Complexity: O(n)
#Space Complexity: O(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0:
            return
        low = 0
        mid = 0
        high = len(nums) - 1

        while mid <= high:
            if nums[mid] == 0:
                self.swap(nums, mid, low)
                mid += 1
                low += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                self.swap(nums, mid, high)
                high -= 1

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp


