# Three pointers. Left and mid initialized to the first index and right to last swap 2's with right and 0's with left and increment mid if it's 1 or 0.
# TC: O(n)
# SC: O(1)
# Yes this code worked in leetcode

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 0:
            return []
        left = 0
        right = len(nums) - 1
        mid = 0
        while mid <= right:
            if nums[mid] == 2:
                nums[mid], nums[right] = nums[right], nums[mid]
                right -= 1
            elif nums[mid] == 0:
                nums[mid], nums[left] = nums[left], nums[mid]
                left += 1
                mid += 1
            else:
                mid += 1
        