# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes      
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach: This code implements the Dutch National Flag algorithm to sort an array of 0s, 1s, and 2s in-place. It uses three pointers: low for the next position of 0, high for the next position of 2, and mid to scan through the array. By swapping based on the value at mid, it places 0s to the left, 2s to the right, and leaves 1s in the middle, achieving a one-pass solution.

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low, high, mid = 0 , len(nums) - 1, 0

        while mid <= high:
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
            
            elif nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                mid += 1
                low += 1
            else:
                mid += 1