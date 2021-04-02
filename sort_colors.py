# Time Complexity: O(n) where n is the number of elements in array
# Space Complexity: O(1)
# Ran on Leetcode: Yes

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not len(nums):
            return
        low = 0
        mid = 0
        high = len(nums) - 1
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