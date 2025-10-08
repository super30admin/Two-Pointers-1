# Time Complexity  : O(n)       # We scan the array once using the mid pointer
# Space Complexity : O(1)       # Sorting is done in-place, no extra space used
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Initially it may seem like we skip elements after swapping,
# but the logic of only moving mid after handling 0 or 1 ensures correctness.

# ------------------------------
# Approach:
# ------------------------------
# This is the "Dutch National Flag" algorithm.
# We maintain three regions:
#   1. [0 .. low-1]     -> all 0s
#   2. [low .. mid-1]   -> all 1s
#   3. [high+1 .. end]  -> all 2s
# The region between mid and high is unsorted.
#
# We use three pointers:
#   low  - position where the next 0 should go
#   mid  - current element being examined
#   high - position where the next 2 should go
#
# Steps:
#   - If nums[mid] == 0 → swap with nums[low], move both forward.
#   - If nums[mid] == 1 → it's already in correct region, move mid forward.
#   - If nums[mid] == 2 → swap with nums[high], move high backward.
#
# This ensures one pass sorting of all 0s, 1s, and 2s.

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # Initialize three pointers
        low, mid, high = 0, 0, len(nums) - 1

        # Keep looping until mid crosses high
        while mid <= high:
            # Case 1: If current element is 2 → send it to the end
            if nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1   # Decrease high since last position is fixed now

            # Case 2: If current element is 0 → send it to the front
            elif nums[mid] == 0:
                nums[mid], nums[low] = nums[low], nums[mid]
                low += 1    # Move low to next position for next 0
                mid += 1    # Move mid to examine next element

            # Case 3: If current element is 1 → it's already in the middle
            else:
                mid += 1    # Just move ahead

        # nums is sorted in-place at the end
