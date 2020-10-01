# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : 
# Your code here along with comments explaining your approach
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea, l, r = 0, 0, len(height)-1
        while l < r:
            maxArea = max( maxArea, min(height[l], height[r])* (r-l))
            if height[l] < height[r]:
                l+=1
            else: 
                r-=1
        return maxArea
       
