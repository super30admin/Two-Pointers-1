#TC O(n) and SC O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None or len(nums) == 0:
            return
        low = 0
        mid = 0
        high = len(nums) - 1
        while mid <= high:
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high = high - 1
            elif nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low = low + 1
                mid = mid + 1
            else:
                mid = mid + 1

        