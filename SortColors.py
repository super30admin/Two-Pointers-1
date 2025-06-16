# Two pointers
#Move 0s to the front and 2s to the end, while keeping 1s in the middle.
#Use pointers low for 0s, high for 2s, and mid to scan the array.
#Swap accordingly and only move mid forward when the current item is 0 or 1.
#Time Complexity:O(n)
#Space Complexity:O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low, high, mid = 0, len(nums)-1, 0

        while mid <= high:
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
            elif nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1
                mid += 1
            else:
                mid += 1