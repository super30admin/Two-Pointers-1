# TC: O(N)
# SC: O(1)
# LeetCode: Y(https://leetcode.com/problems/container-with-most-water)
# Approach: Brute force approach is to consider all possible containers and calculate maximum capacity(N^2 Time Complexity)
#           Optimize the approach by using two pointers from start and end
#           Calculate current area and track the max area seen
#           The goal is to increase the area further
#           Since start and end are at two opposite ends of the container the width is the maximum
#           Remember that area can be maximized by increasing height or width
#           Since we have considered the area with maximum width, we may find a larger area by decreasing the width.
#           When we decrease the width, we may find two ends with more heights which compensates for the decreased width.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        # edge case
        if not(height or len(height)):
            return 0
        
        # two-pointers
        low, high = 0, len(height) - 1
        
        # track max area
        max_area = 0
        
        # loop till a valid container is possible
        while low < high:
            
            # calculate area with current boundaries
            current_area = (high - low) * min(height[low], height[high])
            
            # update max area if possible
            max_area = max(max_area, current_area)
            
            # move the pointer from lower height 
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
         
        # return max area
        return max_area
            
        
