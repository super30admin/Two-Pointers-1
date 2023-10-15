class Solution:
    def maxArea(self, height: List[int]) -> int:
        """
        Time complexity: O(n) - one pass
        Space complexity: O(1) - constant space is used
        Solution: Left pointer, Right Pointer, Variable for maximum area seen so far
        Did this code successfully run on Leetcode: Yes
        Any problem you faced while coding this: No        
        """
        maxarea = 0
        left = 0
        right = len(height) - 1

        while left < right:
            width = right - left
            maxarea = max(maxarea, min(height[left], height[right]) * width)

            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1
            
        return maxarea


        
