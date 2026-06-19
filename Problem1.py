# Problem1 (https://leetcode.com/problems/sort-colors/)
# Time Complexity: O(n), mid moves forward (or high moves backward) each step, single pass through the array
# Space Complexity: O(1),sorting is done in-place using only three pointer variables, no extra array used

# We use three pointers: low for the boundary of 0s, high for the boundary of 2s and mid to scan the array.
# We swap 0s to the front (with low) and 2s to the back (with high), leaving 1s untouched in the middle.
# We only move mid forward when the value is confirmed safe (0 or 1), since a swapped-in 2 still needs checking.

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        low, high, mid = 0, n-1, 0   

        while mid <= high:               # keep scanning until mid crosses into the confirmed 2s region
            if nums[mid] == 2:            # current value belongs at the end
                nums[mid], nums[high] = nums[high], nums[mid]   # swap it into the 2s region
                high -= 1                 # shrink the 2s boundary inward
                # mid is NOT incremented, the swapped-in value at mid hasn't been checked yet
            elif nums[mid] == 0:          # current value belongs at the front
                nums[low], nums[mid] = nums[mid], nums[low]     # swap it into the 0s region
                mid += 1                  # safe to move forward, swapped-in value is guaranteed 0 or 1
                low += 1                  # grow the 0s boundary forward
            else:                          # current value is 1, already in its correct middle position
                mid += 1                  # just move forward to check the next element