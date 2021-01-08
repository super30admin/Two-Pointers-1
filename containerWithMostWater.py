# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
class Solution:
    def maxArea(self, height: List[int]) -> int:
        """
        Initial Thoughts:
            - Have two pointers one at the left and one at the right
                - Move the lower pointer to it's respective direction
            - Can calculate area:
                - base = right - left
                - height = min(height[right], height[left])
        """
        maxArea = 0
        if not height:
            return maxArea 
        
        left = 0 
        right = len(height) - 1
        
        while left < right:
            base = right - left
            heightt = min(height[right], height[left])
            maxArea = max(maxArea, base*heightt)
            
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
                
        return maxArea
                