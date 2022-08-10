"""
Time Complexity : O(n)
Space Complexity :O(1)
Did this code successfully run on Leetcode :
Any problem you faced while coding this :

Problem3 (https://leetcode.com/problems/container-with-most-water/)
"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        """
        Using two pointers to keep track of the height and base of the container.
        Shifting left pointer if the right pointer is greater.
        
        """
        if len(height) == 0: return 0
        
        max_area = float("-inf")
        
        left_ptr, right_ptr = 0, len(height) - 1
        
        while left_ptr < right_ptr:
            max_area = max(max_area, min(height[left_ptr, right_ptr])*height[right_ptr] - height[left_ptr])
            
            if height[left_ptr] < height[right_ptr]:
                left_ptr += 1
            else:
                right_ptr -= 1
                
        return max_area
        