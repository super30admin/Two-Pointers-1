# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

# Take two pointers one at starting and other at ending
# Calculate min height and width, initially maxArea = 0 
# Using these 2 pointers we calcualte area, and update maxArea.
# If height[low] < height[high] increment left pointer

class Solution:
    def maxArea(self, height: List[int]) -> int:
        # Two pointers
        low = 0
        high = len(height) - 1
        maxArea = 0
        while low < high:
            width = high - low
            curr_height = min(height[low], height[high]) # Minimum height
            curr_area = curr_height * width
            maxArea = max(maxArea, curr_area) # Maximum Area
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        return maxArea