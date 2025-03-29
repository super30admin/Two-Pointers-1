# Problem3 (https://leetcode.com/problems/container-with-most-water/)

# TC : O(n) - examine each element at most once

# SC : O(1) 

# Approach:
    # Start with two pointers at the extreme ends of the array (maximizing width)
    # At each step, calculate the area and update the maximum if needed
    # Move the pointer pointing to the shorter line inward (because keeping the shorter line while reducing width will only decrease the area)
    # Continue until the pointers meet

# Did this code successfully run on Leetcode : YES

def maxArea(height):
    # Initialize pointers at the beginning and end of the array
    left = 0
    right = len(height) - 1
    maxArea = 0
    
    # Use two pointer approach to find the maximum area
    while left < right:
        # Calculate the width between the two lines
        width = right - left
        
        # The height is limited by the shorter line
        h = min(height[left], height[right])
        
        # Calculate the area
        area = width * h
        
        # Update maximum area if current area is larger
        maxArea = max(maxArea, area)
        
        # Move the pointer at the shorter line inward
        # (because moving the pointer at the taller line will only reduce the area)
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1
            
    return maxArea