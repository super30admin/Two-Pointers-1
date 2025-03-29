# Problem1 (https://leetcode.com/problems/sort-colors/)

# TC : O(n)

# SC : O(1)

# Approach:
# use three pointers to divide the array into four regions:
#     [0...low-1]: all 0's (red)
#     [low...mid-1]: all 1's (white)
#     [mid...high]: unexplored
#     [high+1...n-1]: all 2's (blue)

# Did this code successfully run on Leetcode : YES

def sortColors(self, nums):
    low = 0
    mid = 0
    high = len(nums) - 1


    while mid <= high:
        if nums[mid] == 0:    # Found red (0)
            nums[low], nums[mid] = nums[mid], nums[low]  # Swap with the low pointer
            low += 1          # Expand the red region
            mid += 1          # Move mid forward to explore next element
        elif nums[mid] == 1:  # Found white (1)
            mid += 1          # Just move forward as 1 is in correct position
        else:                 # Found blue (2)
            nums[mid], nums[high] = nums[high], nums[mid]  # Swap with the high pointer
            high -= 1         # Shrink the unexplored region from right
            # Don't increment mid as the swapped element needs to be checked
        