# Time Complexity : O(n*n) [n = length of the input list]
# 
# Space Complexity : O(1)
# 
# Did this code successfully run on Leetcode : Partially(TLE)
# 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# 1. Explore all the possible areas between any two index
# 2. Update the max_area if the current area is greater
class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = -1
        for i in range(len(height)-1):
            for j in range(i, len(height)):
                min_len = min(height[i], height[j])
                area = min_len * (j-i)
                max_area = max(area, max_area)
        return max_area