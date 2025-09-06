# Time Complexity : O(N)
# Space Complexity : O(1)  
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I am using three pointers, low, mid, and high. The low pointer keeps track of the position to place the next 0,
# the mid pointer is used to traverse the array, and the high pointer keeps track of the position to place the next 2.
# I iterate through the array with the mid pointer, and based on the value at nums[mid], I swap it with the appropriate position (low or high)
# and adjust the pointers accordingly.

from typing import List
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        low = 0
        mid = 0
        high = len(nums) - 1
        while mid <= high:
            if nums[mid] == 0:
                nums[low],nums[mid] = nums[mid],nums[low]
                mid += 1
                low += 1
            elif nums[mid] == 1:
                # low += 1
                mid += 1
            elif nums[mid] == 2:
                nums[high],nums[mid] = nums[mid],nums[high]
                high -= 1
