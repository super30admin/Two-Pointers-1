'''
Problem: Container With Most Water
Time Complexity: O(n), where n is given elements
Space Complexity: O(1)
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        applied 2 pointer approach
        whichever height is shorter, increment that pointer
        calculate maxarea on the go
'''

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        maxarea = 0

        while left<=right:
            h = min(height[left], height[right])
            w = right-left
            maxarea = max(maxarea, h * w)

            if height[left]<=height[right]:
                left+=1
            else:
                right-=1
        
        return maxarea

