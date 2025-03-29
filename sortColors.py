# Time Complexity: O(n), where n is the length of input array
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach:
# 1. We maintain 3 pointers:
# 'low' will collect all 0s
# 'mid' will collect all 1s
# 'high' will collect all 2s
# 'mid' pointer will traverse from index 0 to n-1 and swap elements with low and high if it encounters 1 or 2 respectively.
# We keep iterating until mid pointer crosses the high pointer
from typing import List
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # Swapping 2 elements int the array
        def swap(i, j):
            tmp = nums[i]
            nums[i] = nums[j]
            nums[j] = tmp

        low, mid = 0, 0
        high = len(nums)-1

        while mid <= high:
            # If element at mid is 2, we swap it with element at high
            if nums[mid] == 2:
                swap(mid, high)
                # Now we know that high pointer is holding the color 2, so we can decrement it by 1 to point to the place for holding the next 2.
                high -= 1
            # If element at mid is 0, we swap it with element at low
            elif nums[mid] == 0:
                # Now we know that the element at low is 0 and element at mid can only be 1.
                swap(mid, low)
                # So we move both low and mid pointers. Low will now point to the location to hold the next 0.
                low += 1
                mid += 1
            # If element at mid is 1, we just increment mid by 1
            else:
                mid += 1