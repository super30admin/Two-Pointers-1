"""
## Problem3 (https://leetcode.com/problems/container-with-most-water/)
"""

class Solution:
    # TC: O(n)
    # SC: O(1)
    def maxArea(self, height: List[int]) -> int:
    
        max_area = 0
        
        left_ptr = 0
        right_ptr = len(height) - 1
        
        while (left_ptr < right_ptr):
            
            h = min(height[left_ptr], height[right_ptr])
            w = right_ptr - left_ptr
            
            max_area = max(max_area, h*w)
            
            if (height[left_ptr] < height[right_ptr]):
                left_ptr += 1
                
            else:
                right_ptr -= 1
                
        return max_area