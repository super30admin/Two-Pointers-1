# Problem 3 - Sort Colors
# Time Complexity : O(n)
# Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this :
'''
The main issue I faced was figuring out how to use the pointers effectively to solve the problem, which would also help in 
applying the sorting logic.
'''

# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # left pointer for number 0, middle for number 1
        left, middle = 0, 0
        # right pointer for number 2
        right = len(nums) - 1
        # loop till middle cross right pointer
        while middle <= right:
            # If the middle pointer is pointing to 0 then swap the numbers at left and middle pointer. Increments left, middle pointers
            if nums[middle] == 0:
                nums[middle], nums[left] = nums[left], nums[middle]
                left += 1
                middle += 1
            # If the middle pointer is pointing to 2 then swap the numbers at right and middle pointer. Decrement the right pointer
            elif nums[middle] == 2:
                nums[middle], nums[right] = nums[right], nums[middle]
                right -= 1
            # If the middle pointer is pointing to 1 then increment middle pointer
            else:
                middle += 1
