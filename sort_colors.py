# Approach (Dutch National Flag Algorithm):
# The array contains only three possible values: 0 (red), 1 (white), and 2 (blue).
# We maintain three pointers:
#   - low: boundary for 0s (everything before 'low' is 0)
#   - mid: current element under consideration
#   - high: boundary for 2s (everything after 'high' is 2)
#
# Algorithm:
# 1. Start with all pointers at the edges (low=0, mid=0, high=n-1).
# 2. Traverse the array:
#     - If nums[mid] == 0 → swap it with nums[low], then increment both low and mid.
#     - If nums[mid] == 1 → it's already in the correct position, just move mid forward.
#     - If nums[mid] == 2 → swap it with nums[high], then decrement high (do NOT increment mid yet).
# 3. Continue until mid > high.
#
# Time Complexity: O(n) — each element is checked at most once.
# Space Complexity: O(1) — sorting is done in-place.

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        # Pointers for current positions of red (0), white (1), and blue (2)
        low = 0              # Next position for 0
        mid = 0              # Current element under examination
        high = len(nums) - 1 # Next position for 2

        # Traverse until all elements are processed
        while mid <= high:
            # Case 1: Current number is 0 → swap with 'low' and move both pointers
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1

            # Case 2: Current number is 1 → correct place, just move mid
            elif nums[mid] == 1:
                mid += 1

            # Case 3: Current number is 2 → swap with 'high' and move high backward
            # (don't increment mid yet because the swapped element needs checking)
            else:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1