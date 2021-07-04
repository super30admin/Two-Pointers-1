"""
Time Complexity : O(n^2)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : none
"""

class Solution:
    def maxArea(self, height):
        len_n = len(height)
        if height == None or len_n < 2:
            return 0
        
        l = 0
        h = len_n - 1
        max_area = 0
        
        while l < h:
            max_area = max(max_area, min(height[l], height[h]) * (h - l))
            if height[l] < height[h]:
                l += 1
            else:
                h -= 1
        
        return max_area
    
s = Solution()
print(s.maxArea([1,8,6,2,5,4,8,3,7]))