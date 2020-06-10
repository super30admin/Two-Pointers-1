# Time Complexity : O(n) [n = length of the input list]
# 
# Space Complexity : O(1)
# 
# Did this code successfully run on Leetcode : Yes
# 
# Any problem you faced while coding this : No
#
# Problem Approach
# 1. Fix the end pointer at last index and try to compute all the possible areas by moving the start index
# 2. This goes on until we hit a start index at which the value is greater than value at end index. In this case we decrement the count.
class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = -1
        start, end = 0, len(height)-1
        while start < end:
            min_height = min(height[start], height[end])
            max_area = max(max_area, min_height * (end-start))
            
            # Fix the end pointer and 
            if height[start] < height[end]:
                start+=1
            else:
                end-=1
        return max_area