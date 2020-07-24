# APPROACH 1
# Time Complexity : O(n), n: length of heights
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. start from both end of heights. 
# 2. Calculate area at each step -> distance between 2 heights * min of 2 heights
# 3. Then we shrink the distance between the 2 heights by moving either of the pointers. Since we are shrinking the distance, in order to get greater area need to find greater 
#    height. So we shift the min of two heights, in hopes of finding a larger height

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        if not height or len(height) < 2:
            return None
        
        column_start, column_end = 0, len(height) - 1
        max_area = 0
        
        while column_start < column_end:
            curr_area = (column_end - column_start) * min(height[column_start], height[column_end])
            max_area = max(max_area, curr_area)
            
            if height[column_start] < height[column_end]:
                column_start += 1
            else:
                column_end -= 1
                
        return max_area
