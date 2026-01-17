class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left = 0 #to catch 0s
        right = len(nums)-1 #to catch 2s
        mid = left #to iterate the array and to catch 1s

        while mid <= right:
            if nums[mid] == 2:
                nums[mid], nums[right] = nums[right], nums[mid]
                right -= 1 #cant move mid here because left is not yet sorted. The value swapped from the right into mid is unknown. It can be 0,1,2 so we need to re-check it in next iteration.

            elif nums[mid] == 0:
                nums[mid], nums[left] = nums[left], nums[mid]
                left += 1
                mid += 1 #left is sorted so move mid. everything before mid was already processed, so the swapped value is guaranteed to be a 1. it can't be a 2 as its always taken care of first.
            else:
                mid += 1

# You only move mid when you are sure the value at mid is finalized.

# After 0 → finalized
# After 1 → finalized
# After swapping with right → not finalized

# Time complexity: O(N)
# Space Complexity: O(1)