# Time Complexity : O(n) where n is the length of the array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Use Dutch National Flag algorithm with three pointers (left, current, right).
# Left pointer tracks boundary of 0s, right pointer tracks boundary of 2s, current pointer traverses.
# Swap elements based on current value: 0 goes to left, 2 goes to right, 1 stays in middle.

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left = 0
        current = 0
        right = len(nums) - 1
        
        while current <= right:
            if nums[current] == 0:
                # Swap with left pointer and move both forward
                nums[left], nums[current] = nums[current], nums[left]
                left += 1
                current += 1
            elif nums[current] == 2:
                # Swap with right pointer, only move right backward
                nums[current], nums[right] = nums[right], nums[current]
                right -= 1
            else:
                # nums[current] == 1, just move current forward
                current += 1

