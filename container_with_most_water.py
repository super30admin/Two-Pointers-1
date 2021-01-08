# Approach: Brute Force - We would consider every pair of height and check what the area would be and update the max 
# This would have O(N^2) time complexity
# Space Complexity: O(1)

# Optimized Solution: Would be to use 2 pointers
# 2 pointers left and right pointing to two heights. 
# Update the max area with previous max observed so far and min of heights.
# We take minimum of heights since while calculating area we can only calc with the min of two heights multiplied by its width represented by left and right pointers
# Time Complexity: O(N)
# Space: O(1)


def container_with_most_array(heights):
    if not heights:
        return
    maxArea = 0
    left = 0
    right = len(heights) - 1
    while left < right:
        maxArea = max(maxArea, min(heights[left], heights[right]) * (right-left))
        if heights[left] < heights[right]:
            left += 1

        elif heights[left] > heights[right]:
            right -= 1

        else:
            left += 1

    return maxArea
