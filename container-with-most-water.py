"""
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
In this case, the max area of water (blue section) the container can contain is 49.

Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
      
        l = 0  # Left pointer
        r = len(height) - 1  # Right pointer
        area = 0  # Variable to store the maximum area

        # Use two-pointer approach to find the maximum water container
        while l < r:
            total = (r - l) * min(height[l], height[r])  # Calculate current area
            area = max(area, total)  # Update max area if the current area is larger

            # Move the pointer pointing to the shorter line to potentially increase the area
            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1

        return area  
