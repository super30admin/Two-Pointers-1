"""
Implemented using the three-pointer approach with low, mid, and high, where low and mid start at the same position and high is initialized at the end of the array. The pointers move accordingly based on the value encountered (0, 1, or 2).
Time Complexity: O(n)
Space Complexity: O(1)
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = mid = 0
        high = len(nums) - 1
        while(mid <= high):
            # for 0
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            # for 1
            elif nums[mid] == 1:
                mid += 1
            # for 2
            else:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1