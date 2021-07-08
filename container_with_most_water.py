"""
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach
Algorithm explanation
How to know what optimal solution can be
- At least n
- What pillar/height has better chance of giving max area
    - accorindingly increment and decrement the left and right pts
     based on which has a lesser value ( since we are targetting towards a value
     that gives better chance of having max area)
 """
 class Solution:
    def maxArea(self, height: List[int]) -> int:
        """
        Brute force - Considering all pairings of heights from left and right and selecting the minimum of 2 heights and computing the area and compare with the max
        Optimal
        - At least n
        - What pillar/height has better chance of giving max area
            - accordingly increment and decrement the left and right pts
            based on which has a lesser value ( since we are targetting towards a value that gives better chance of having max area)
        """
        n = len(height)
        left,right=0,n-1
        max_area = float("-inf")
        for i in height:
            if height[left] < height[right]:# update the area using height of left and move towards right
                max_area = max(max_area,height[left]* (right- left))
                left+=1
            else:# update the area using height of left and move towards left
                max_area = max(max_area,height[right]* (right- left))
                right-=1
        
        return max_area