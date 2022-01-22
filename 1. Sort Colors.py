class Solution:
    def sortColors(self, nums) -> None:
        # Time Complexity - O(n)
        # Space Complexity - O(1)
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        high = len(nums) - 1

        mid = 0

        while mid <= high:
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1